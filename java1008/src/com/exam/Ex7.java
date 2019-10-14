package com.exam;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


class PersonHandler extends DefaultHandler {
	
	private List<PersonVO> list = new ArrayList<PersonVO>();
	private PersonVO personVo;
	
	private StringBuilder sb = new StringBuilder();
	
	public List<PersonVO> getList() {
		return list;
	}

	public PersonVO getPersonVo() {
		return personVo;
	}

	public StringBuilder getSb() {
		return sb;
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// <접두사:태그명  속성명="속성값" />
		if (qName.equals("person")) {
			personVo = new PersonVO();
			personVo.setId(Integer.parseInt(attributes.getValue("id")));
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (qName.equals("name")) {
			personVo.setName(sb.toString().trim());
			sb.setLength(0); // StringBuilder 내용 지우기
		} else if (qName.equals("company")) {
			personVo.setCompany(sb.toString().trim());
			sb.setLength(0);
		} else if (qName.equals("person")) {
			list.add(personVo);
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// new String(ch, start, length);
		sb.append(ch, start, length);
	}
	
} // class PersonHandler




public class Ex7 {

	public static void main(String[] args) {
		// SAX Parser로 xml문서 파싱하기
		String path = Ex7.class.getResource("personList.xml").getPath();
		System.out.println("path : " + path);
		
		File file = new File(path);
		if (!file.exists()) {
			System.out.println("읽을 XML 파일이 없습니다.");
			return;
		}
		
		
		SAXParserFactory factory = SAXParserFactory.newInstance();
		try {
			SAXParser saxParser = factory.newSAXParser();
			
			PersonHandler handler = new PersonHandler();
			saxParser.parse(file, handler);
			
			List<PersonVO> personList = handler.getList();
			for(PersonVO personVO : personList) {
				System.out.println(personVO);
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // main method

}
