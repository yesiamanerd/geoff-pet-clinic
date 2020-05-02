package guru.springframework.geoffpetclinic.bootstrap;

import guru.springframework.geoffpetclinic.model.Owner;
import guru.springframework.geoffpetclinic.model.Vet;
import guru.springframework.geoffpetclinic.services.OwnerService;
import guru.springframework.geoffpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    // @Autowired is not required for Spring5
    public DataLoader(OwnerService ownerService, VetService vetService){

        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fionna");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);

        System.out.println("Loaded Owners ....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Nigel");
        vet2.setLastName("Brody");

        vetService.save(vet2);

        System.out.println("Loaded Vets ....");
    }
}
