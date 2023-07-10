package in.ineuron.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Actor {
	
	public Actor(Integer aid, String name, Float age, String type) {
		super();
		this.aid = aid;
		this.name = name;
		this.age = age;
		this.type = type;
	}
	private Integer aid;
	private String name;
	private Float age;
	private String type;
}
