package guru.springframework.geoffpetclinic.services;

import guru.springframework.geoffpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String name);
}
