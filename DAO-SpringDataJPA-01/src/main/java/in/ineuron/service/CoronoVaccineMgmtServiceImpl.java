package in.ineuron.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.bo.CoronaVaccine;
import in.ineuron.dao.ICoronaVaccineRepo;

@Service("service")
public class CoronoVaccineMgmtServiceImpl implements ICoronaVaccineMgmtService {

	@Autowired
	private ICoronaVaccineRepo repo;

	@Override
	public String registerVacine(CoronaVaccine vaccine) {
		System.out.println("In Memory proxy class is :: " + repo.getClass().getName());

		CoronaVaccine saveVaccine = null;
		if (vaccine != null) {
			saveVaccine = repo.save(vaccine);
		}
		return saveVaccine != null ? "vaccine registered succesfully with " + saveVaccine.getRegNo()
				: "vaccine registration failed";
	}

	
	}

