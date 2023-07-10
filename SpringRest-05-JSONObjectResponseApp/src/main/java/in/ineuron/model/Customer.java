package in.ineuron.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.Data;

@Data
public class Customer {
	private Integer cno;
	private String cname;
	private Float billAmount;
	private String[] teamNames;	
	private List<String> studies;
	private Set<Long> phoneNumbers;
	public void setIdDetails(Map<String, Object> idDetails) {
		this.idDetails = idDetails;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Map<String,Object> idDetails;
	
	public Company company;

	public void setCno(Integer cno) {
		this.cno = cno;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public void setBillAmount(Float billAmount) {
		this.billAmount = billAmount;
	}

	public void setStudies(List<String> studies) {
		this.studies = studies;
	}

	public void setPhoneNumbers(Set<Long> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public void setTeamNames(String[] teamNames) {
		this.teamNames = teamNames;
	}
}
