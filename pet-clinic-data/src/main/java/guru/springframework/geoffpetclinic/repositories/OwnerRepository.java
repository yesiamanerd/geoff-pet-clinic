package guru.springframework.geoffpetclinic.repositories;

import guru.springframework.geoffpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String name);

    List<Owner> findAllByLastNameLike(String lastName);
}
