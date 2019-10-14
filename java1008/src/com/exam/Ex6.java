package com.exam;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Ex6 {

	public static void main(String[] args) {
		// DOM 파서로 파싱하기
		
		List<CompanyVO> companyList = new ArrayList<CompanyVO>();
		
		try {
			URL url = new URL("http://kobis.or.kr/kobisopenapi/webservice/rest/company/searchCompanyList.xml?key=430156241533f1d058c603178cc3ca0e");
			
			// DOM 파서 객체 준비하기
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			// 파싱 수행 완료후 document 생성
			Document document = builder.parse(url.openStream());
			
			System.out.println("파싱 후 Document 객체 생성완료!");
			
			
			// company 태그를 기준으로 노드리스트 가져오기
			NodeList nodeList = document.getElementsByTagName("company");
			
			for (int i=0; i<nodeList.getLength(); i++) {
				CompanyVO companyVO = new CompanyVO(); // VO 준비
				Node node = nodeList.item(i); // company node
				
				// company 노드의 자식노드들을 노드리스트로 가져오기
				NodeList childNodeList = node.getChildNodes();
				for (int j=0; j<childNodeList.getLength(); j++) {
					Node childNode = childNodeList.item(j);
					
					if (childNode.getNodeName().equals("companyCd")) {
						companyVO.setCompanyCd(Long.parseLong(childNode.getFirstChild().getNodeValue()));
					} else if (childNode.getNodeName().equals("companyNm")) {
						companyVO.setCompanyNm(childNode.getFirstChild().getNodeValue());
					} else if (childNode.getNodeName().equals("filmoNames")) {
						if (childNode.getFirstChild() != null) companyVO.setFilmoNames(childNode.getFirstChild().getNodeValue());
					}
				} // inner for
				
				
				// 다 채워진 VO를 리스트에 추가
				companyList.add(companyVO);
				
			} // outer for
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("companyList 생성 완료!");
		
		for(CompanyVO companyVO : companyList) {
			System.out.println(companyVO);
		}

	} // main method

}
