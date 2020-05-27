package guru.springframework.geoffpetclinic.services;

import guru.springframework.geoffpetclinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String name);

    List<Owner> findAllByLastNameLike(String lastName);
}
