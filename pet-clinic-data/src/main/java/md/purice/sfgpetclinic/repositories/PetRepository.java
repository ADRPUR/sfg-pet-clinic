package md.purice.sfgpetclinic.repositories;

import md.purice.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository  extends CrudRepository<Pet, Long> {
}
