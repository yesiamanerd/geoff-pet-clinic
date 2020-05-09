package guru.springframework.geoffpetclinic.repositories;

import guru.springframework.geoffpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
