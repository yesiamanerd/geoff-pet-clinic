package guru.springframework.geoffpetclinic.bootstrap;

import guru.springframework.geoffpetclinic.model.Owner;
import guru.springframework.geoffpetclinic.model.Pet;
import guru.springframework.geoffpetclinic.model.PetType;
import guru.springframework.geoffpetclinic.model.Vet;
import guru.springframework.geoffpetclinic.services.OwnerService;
import guru.springframework.geoffpetclinic.services.PetTypeService;
import guru.springframework.geoffpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    // @Autowired is not required for Spring5
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService){

        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Brickell");
        owner1.setCity("Miami");
        owner1.setTelephone("12334567");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fionna");
        owner2.setLastName("Glenanne");
        owner2.setAddress("123 Brickell");
        owner2.setCity("Miami");
        owner2.setTelephone("12334567");

        Pet fionnasPet = new Pet();
        fionnasPet.setPetType(savedCatPetType);
        fionnasPet.setOwner(owner1);
        fionnasPet.setBirthDate(LocalDate.now());
        fionnasPet.setName("Lula");
        owner2.getPets().add(fionnasPet);

        ownerService.save(owner2);

        System.out.println("Loaded Owners ....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Nigel");
        vet2.setLastName("Brody");

        vetService.save(vet2);

        System.out.println("Loaded Vets ....");
    }
}
