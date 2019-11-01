package company.unit.development.service;

import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import company.unit.development.DTO.g2bSearchDto;
import company.unit.development.DTO.g2bSearchRequestDto;
import company.unit.development.DTO.g2bSearchResponseDto;

@Service
@Transactional
public class XmlPareServiceImpl implements ParseService{

//	private RestTemplate template = new RestTemplate();
	private final String URL = "http://apis.data.go.kr/1230000/ScsbidInfoService/getOpengResultListInfoCnstwk";
//	private final String key = "9s4gRft8gnWr6fo6gnxD6UXBzHj5gLGjGfllSuazFkendirH%2FyPbiZ7uirB2ZzwaWcC87qQChsI5w2t20BSnwA%3D%3D";
	
	
	@Override
	public List<g2bSearchDto> parseNara(g2bSearchRequestDto dto){
		List<g2bSearchDto> nara = new ArrayList<g2bSearchDto>();
		try {
			URI uri = new URI(URL 
					+ "&serviceKey=" + dto.getServiceKey() 
					+ "&pageNo=" + dto.getPageNo()
					+ "&numOfRows=" + dto.getNumOfRows()
					+ "&inqryDiv=" +dto.getInqryDiv()
					+ "&inqryBgnDt=" + dto.getInqryBgnDt()
					+ "&inqryEndDt=" + dto.getInqryEndDt()
					+ "&bidNtceNo=" + dto.getBidNtceNo()
					+ "&type=json");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return nara;
	}
}
