package guru.springframework.geoffpetclinic.services;

import guru.springframework.geoffpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);

    Set<Vet> findAll();
}
