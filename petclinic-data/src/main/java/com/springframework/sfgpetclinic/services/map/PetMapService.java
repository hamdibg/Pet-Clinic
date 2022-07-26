package com.springframework.sfgpetclinic.services.map;

import com.springframework.sfgpetclinic.model.Pet;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import com.springframework.sfgpetclinic.services.PetService;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class PetMapService extends AbstractMapService<Pet,Long> implements PetService {

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
        return super.save(object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
