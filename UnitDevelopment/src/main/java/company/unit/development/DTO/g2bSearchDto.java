package company.unit.development.DTO;

import java.util.Date;


import lombok.Data;

@Data
//@XmlRootElement(name="item")
public class g2bSearchDto {
//	private int resultCode;
//	private String  resultMsg;
//	private int numOfRows;
//	private int pageNo;
//	private int totalCount;
	private int bidNtceNo;
	private int bidNtceOrd;
	private int bidClsfcNo;
	private int rbidNo;
	private String bidNtceNm;
	private Date opengDt;
	private int prtcptCnum;
	private String opengCorpInfo;
	private String progrsDivCdNm;
	private Date inptDt;
	private String rsrvtnPrceFileExistnceYn;
	private int ntceInsttCd;
	private String ntceInsttNm;
	private int dminsttCd;
	private String dminsttNm;
	
}
