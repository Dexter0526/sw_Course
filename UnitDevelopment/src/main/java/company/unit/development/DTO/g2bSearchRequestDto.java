package company.unit.development.DTO;

import lombok.Data;

@Data
public class g2bSearchRequestDto {
	private String ServiceKey;
	private int pageNo;
	private int numOfRows;
	private int inqryDiv;
	private long inqryBgnDt;
	private long inqryEndDt;
	private int bidNtceNo;
	
	public g2bSearchRequestDto() {
		this("9s4gRft8gnWr6fo6gnxD6UXBzHj5gLGjGfllSuazFkendirH", 1, 20,	1);
	}

	public g2bSearchRequestDto(String serviceKey, int pageNo, int numOfRows, int inqryDiv) {
		this.ServiceKey = serviceKey;
		this.pageNo = pageNo;
		this.numOfRows = numOfRows;
		this.inqryDiv = inqryDiv;
	}
	
}
