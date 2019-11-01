package company.unit.development.service;

import java.util.List;

import company.unit.development.DTO.g2bSearchDto;
import company.unit.development.DTO.g2bSearchRequestDto;

public interface ParseService {
	
	public List<g2bSearchDto> parseNara(g2bSearchRequestDto dto);
}
