package in.ineuron.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {

	private String cname;
	public Company(String cname, String ctype, String cddress, Integer size) {
		super();
		this.cname = cname;
		this.ctype = ctype;
		this.cddress = cddress;
		this.size = size;
	}
	private String ctype;
	private String cddress;
	private Integer size;

}
