package company.unit.development.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import company.unit.development.DTO.g2bSearchDto;
import company.unit.development.DTO.g2bSearchRequestDto;

@Service
@Transactional
public class XmlPareServiceImpl implements ParseService{

//	private RestTemplate template = new RestTemplate();
	private final String URL = "http://apis.data.go.kr/1230000/ScsbidInfoService/getOpengResultListInfoCnstwk";
//	private final String key = "9s4gRft8gnWr6fo6gnxD6UXBzHj5gLGjGfllSuazFkendirH%2FyPbiZ7uirB2ZzwaWcC87qQChsI5w2t20BSnwA%3D%3D";

	
//	public static void main(String[] args) {
//				
//		BufferedReader reader = null;
//		try {
//			URL url = new URL("http://apis.data.go.kr/1230000/ScsbidInfoService/getOpengResultListInfoCnstwk?serviceKey=9s4gRft8gnWr6fo6gnxD6UXBzHj5gLGjGfllSuazFkendirH%2FyPbiZ7uirB2ZzwaWcC87qQChsI5w2t20BSnwA%3D%3D&numOfRows=10&pageNo=1&inqryDiv=1&inqryBgnDt=201605010000&inqryEndDt=201605052359&bidNtceNo=20160329825&type=json");
//			
//			reader = new BufferedReader(new InputStreamReader(url.openStream(), "utf-8"));
//			
//			String line = "";
//			while ((line = reader.readLine()) != null) {
//				System.out.println(line);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	}
	
	@Override
	public List<g2bSearchDto> parseNara(g2bSearchRequestDto dto){
		List<g2bSearchDto> nara = new ArrayList<g2bSearchDto>();
		
		BufferedReader reader = null;
		try {
			URL url = new URL(URL 
					+ "?serviceKey=" + dto.getServiceKey() 
					+ "&pageNo=" + dto.getPageNo()
					+ "&numOfRows=" + dto.getNumOfRows()
					+ "&inqryDiv=" +dto.getInqryDiv()
					+ "&inqryBgnDt=" + dto.getInqryBgnDt()
					+ "&inqryEndDt=" + dto.getInqryEndDt()
					//+ "&bidNtceNo=" + dto.getBidNtceNo()
					+ "&type=json");
			
			reader = new BufferedReader(new InputStreamReader(url.openStream(), "utf-8"));
			
			
			
			
			
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
			JSONObject response = (JSONObject) jsonObject.get("response");
			JSONObject body = (JSONObject) response.get("body");
			JSONArray naraListArray = (JSONArray) body.get("items");
			
			Iterator<JSONObject> iter = naraListArray.iterator();
			
			while(iter.hasNext()) {
				JSONObject rowObject = (JSONObject) iter.next();
				
				g2bSearchDto g2bDto = new g2bSearchDto();
				
				g2bDto.setBidNtceNo((int) rowObject.get("bidNtceNo"));
				g2bDto.setBidNtceOrd((int) rowObject.get("bidNtceOrd"));
				g2bDto.setBidClsfcNo((int) rowObject.get("bidClsfcNo"));
				g2bDto.setRbidNo((int) rowObject.get("rbidNo"));
				g2bDto.setBidNtceNm((String) rowObject.get("bidNtceNm"));
				g2bDto.setOpengDt((Date) rowObject.get("opengDt"));
				g2bDto.setPrtcptCnum((int) rowObject.get("prtcptCnum"));
				g2bDto.setOpengCorpInfo((String) rowObject.get("opengCorpInfo"));
				g2bDto.setProgrsDivCdNm((String) rowObject.get("progrsDivCdNm"));
				g2bDto.setInptDt((Date) rowObject.get("inptDt"));
				g2bDto.setRsrvtnPrceFileExistnceYn((String) rowObject.get("rsrvtnPrceFileExistnceYn"));
				g2bDto.setNtceInsttCd((int) rowObject.get("ntceInsttCd"));
				g2bDto.setNtceInsttNm((String) rowObject.get("ntceInsttNm"));
				g2bDto.setDminsttCd((int) rowObject.get("dminsttCd"));
				g2bDto.setDminsttNm((String) rowObject.get("dminsttNm"));
				
				nara.add(g2bDto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return nara;
	}
}
