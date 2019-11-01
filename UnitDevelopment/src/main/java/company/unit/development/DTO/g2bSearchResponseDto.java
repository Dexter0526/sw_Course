package company.unit.development.DTO;

import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "response")
public class g2bSearchResponseDto {

	
	private Map<String, String> header;
	private g2bSearchItemsDto body;
	
	public Map<String, String> getHeader() {
		return header;
	}
	public void setHeader(Map<String, String> header) {
		this.header = header;
	}
	public g2bSearchItemsDto getBody() {
		return body;
	}
	public void setBody(g2bSearchItemsDto body) {
		this.body = body;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("g2bSearchResponseDto [header=").append(header).append(", body=").append(body).append("]");
		return builder.toString();
	}
	
	
}
