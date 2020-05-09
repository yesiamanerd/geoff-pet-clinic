package guru.springframework.geoffpetclinic.repositories;

import guru.springframework.geoffpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
