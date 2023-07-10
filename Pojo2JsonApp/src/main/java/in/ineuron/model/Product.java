package in.ineuron.model;

import lombok.Data;

@Data
public class Product {
	private Integer pid;
	public Integer getPid() {
		return pid;
	}
	public String getPname() {
		return pname;
	}
	public Double getPrice() {
		return price;
	}
	public String[] getTypes() {
		return types;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public void setTypes(String[] types) {
		this.types = types;
	}
	private String pname;
	private Double price;
	private String[] types;
}
