package com.exam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Ex10 {

	public static void main(String[] args) {
		// 준비
		List<CompanyVO> list = new ArrayList<CompanyVO>();
		
		
		// JSON 파서로 파싱하기
		
		BufferedReader reader = null;
		
		try {
			URL url = new URL("http://kobis.or.kr/kobisopenapi/webservice/rest/company/searchCompanyList.json?key=430156241533f1d058c603178cc3ca0e");
			
			reader = new BufferedReader(new InputStreamReader(url.openStream(), "utf-8"));
			
			
			// JSON 파서 준비하기
			JSONParser jsonParser = new JSONParser();
			// JSON 파싱 수행하기
			JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
			
			JSONObject listResultObject = (JSONObject) jsonObject.get("companyListResult");
			
			JSONArray companyListArray = (JSONArray) listResultObject.get("companyList");
			
			// 반복자 구하기
			Iterator<JSONObject> iter = companyListArray.iterator();
			
			while (iter.hasNext()) {
				JSONObject rowObject = iter.next();
				
				CompanyVO companyVO = new CompanyVO();
				companyVO.setCompanyCd(Long.parseLong((String) rowObject.get("companyCd")));
				companyVO.setCompanyNm((String) rowObject.get("companyNm"));
				companyVO.setFilmoNames((String) rowObject.get("filmoNames"));
				
				list.add(companyVO);
			} // while
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		// 출력
		for (CompanyVO companyVO : list) {
			System.out.println(companyVO);
		}
		
		
	} // main method

}
