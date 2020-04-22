package guru.springframework.geoffpetclinic.services;

import guru.springframework.geoffpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);

    Set<Pet> findAll();
}
