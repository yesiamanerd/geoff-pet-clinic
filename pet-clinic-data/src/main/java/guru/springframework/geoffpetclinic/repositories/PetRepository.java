package guru.springframework.geoffpetclinic.repositories;

import guru.springframework.geoffpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
