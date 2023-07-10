package in.ineuron.error;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetails {

	public ErrorDetails(LocalDateTime time, String msg, String status) {
		super();
		this.time = time;
		this.msg = msg;
		this.status = status;
	}
	private LocalDateTime time;
	private String msg;
	private String status;

}
