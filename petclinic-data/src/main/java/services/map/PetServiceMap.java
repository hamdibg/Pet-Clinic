package services.map;

import guru.springframework.sfgpetclinic.model.Pet;
import services.PetService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long ID) {
        super.deleteById(ID);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);

    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(1L), object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
