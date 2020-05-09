package guru.springframework.geoffpetclinic.repositories;

import guru.springframework.geoffpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
