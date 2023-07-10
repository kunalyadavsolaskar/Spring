package in.ineuron.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Address {
	@JsonProperty("street")
	private String street;
	@JsonProperty("city")
	private String city;
	@JsonProperty("state")
	private String state;
	@JsonProperty("zip")
	private String zip;
	@JsonProperty("country")
	private String country;
}
