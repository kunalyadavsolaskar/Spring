package ineuron.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer {
	@JsonProperty("id")
    private String id;
	@JsonProperty("name")
    private String name;
	@JsonProperty("email")
    private String email;

    // Constructors, getter and setter methods

    // Override toString() method for printing the POJO data
    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
