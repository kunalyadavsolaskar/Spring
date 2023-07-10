package in.ineuron;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import in.ineuron.bo.*;
import in.ineuron.service.ICoronaVaccineMgmtService;

@SpringBootApplication
public class DaoSpringDataJpa01Application {

	public static void main(String[] args) {
		ApplicationContext factory = SpringApplication.run(DaoSpringDataJpa01Application.class, args);
		ICoronaVaccineMgmtService service = factory.getBean(ICoronaVaccineMgmtService.class);

		 CoronaVaccine vaccine = new CoronaVaccine(null, "covidshield", "serum",
				  "IND", 750.0, 2); System.out.println(service.registerVacine(vaccine));
		System.out.println(service.registerVacine(vaccine));
		((ConfigurableApplicationContext) factory).close();
	}

}
