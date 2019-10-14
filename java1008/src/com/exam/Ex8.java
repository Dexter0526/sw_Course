package com.exam;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


class CompanyHandler extends DefaultHandler {
	
	private CompanyVO companyVo;
	private List<CompanyVO> list = new ArrayList<CompanyVO>();
	private StringBuilder sb = new StringBuilder();
	
	public List<CompanyVO> getList() {
		return list;
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if (qName.equals("company")) {
			companyVo = new CompanyVO();
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (qName.equals("companyCd")) {
			companyVo.setCompanyCd(Long.parseLong(sb.toString()));
		} else if (qName.equals("companyNm")) {
			companyVo.setCompanyNm(sb.toString());
		} else if (qName.equals("filmoNames")) {
			companyVo.setFilmoNames(sb.toString());

		} else if (qName.equals("company")) {
			list.add(companyVo);
		}
		sb.setLength(0);	// 버퍼 초기화
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		sb.append(ch, start, length);
	}
	
} // class CompanyHandler


public class Ex8 {

	public static void main(String[] args) {
		// SAX 파서로 파싱하기
		
		try {
			URL url = new URL("http://kobis.or.kr/kobisopenapi/webservice/rest/company/searchCompanyList.xml?key=430156241533f1d058c603178cc3ca0e");
			
			// SAX 파서 준비하기
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			
			CompanyHandler handler = new CompanyHandler();
			// 파싱 수행하기
			saxParser.parse(url.openStream(), handler);
			
			// 파싱 결과 가져오기
			List<CompanyVO> companyList = handler.getList();
			for (CompanyVO companyVO : companyList) {
				System.out.println(companyVO);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // main method

}
