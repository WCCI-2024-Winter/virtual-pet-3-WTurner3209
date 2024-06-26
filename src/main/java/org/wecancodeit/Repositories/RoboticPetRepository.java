package org.wecancodeit.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.Models.RoboticPetModel;

public interface RoboticPetRepository extends CrudRepository<RoboticPetModel, Long> {

    Iterable<RoboticPetModel> findByManufacturer(String pet);
    
}
