package in.ineuron.model;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer {
	private Integer id;
	public Integer getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Boolean getActive() {
		return active;
	}

	public Address getAddress() {
		return address;
	}

	public String[] getLanguages() {
		return languages;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}

	private String firstName;
	private String lastName;
	private Boolean active;

	// HAS-A property
	private Address address;

	// Array property
	private String[] languages;
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", active=" + active
				+ ", address=" + address + ", languages=" + Arrays.toString(languages) + "]";
	}
	
	
	
}
