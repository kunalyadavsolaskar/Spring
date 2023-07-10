package in.ineuron.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomerDTO {

	public CustomerDTO(int i, String string, float f) {
		// TODO Auto-generated constructor stub
	}
	private Integer cno;
	private String cname;
	private Float billAmt;
	private String caddr;
	private Long mobileNo;
}
