package dresseur;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Dresseur;
@Repository
public interface DresseurRepo extends JpaRepository<Dresseur, Long> {

}
