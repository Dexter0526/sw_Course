package company.unit.development.DTO;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "body")
public class g2bSearchItemsDto {
	private List<g2bSearchDto> items;

	
	@XmlElementWrapper(name="items")
	@XmlElement(name = "item")
	public List<g2bSearchDto> getItems() {
		return items;
	}

	public void setItems(List<g2bSearchDto> items) {
		this.items = items;
	}
	
}
