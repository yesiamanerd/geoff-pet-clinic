package guru.springframework.geoffpetclinic.repositories;

import guru.springframework.geoffpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
