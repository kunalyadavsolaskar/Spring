package in.ineuron.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Tourist {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer tid;
	
	private String city;
	private String name;
	private String packageType;
	private Double budget;
	public Integer getTid() {
		return tid;
	}
	public String getCity() {
		return city;
	}
	public String getName() {
		return name;
	}
	public String getPackageType() {
		return packageType;
	}
	public Double getBudget() {
		return budget;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}
	public void setBudget(Double budget) {
		this.budget = budget;
	}
}
