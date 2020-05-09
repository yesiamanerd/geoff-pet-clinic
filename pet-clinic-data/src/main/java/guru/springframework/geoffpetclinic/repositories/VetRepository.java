package guru.springframework.geoffpetclinic.repositories;

import guru.springframework.geoffpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
