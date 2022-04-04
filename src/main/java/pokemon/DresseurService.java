package pokemon;

import java.util.List;

//import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Dresseur;

@Service
public class DresseurService {

	private final DresseurRepo dresseurRepo;
	
	@Autowired
	public DresseurService(DresseurRepo dresseurRepo) {
		
		this.dresseurRepo = dresseurRepo;
	}


	public List<Dresseur> getAllDresseur() {
		return dresseurRepo.findAll();
	}
	
}
