package guru.springframework.geoffpetclinic.services.springdatajpa;

import guru.springframework.geoffpetclinic.model.Visit;
import guru.springframework.geoffpetclinic.repositories.VisitRepository;
import guru.springframework.geoffpetclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VisitSPJpaService implements VisitService {

    private final VisitRepository visitRepository;

    public VisitSPJpaService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(Long aLong) {

        return visitRepository.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit object) {

        return visitRepository.save(object);
    }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepository.deleteById(aLong);
    }
}
