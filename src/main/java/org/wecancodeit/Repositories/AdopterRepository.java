package org.wecancodeit.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.Models.AdoptersModel;



public interface AdopterRepository extends CrudRepository<AdoptersModel, Long> {


    Iterable<AdoptersModel> findByName(String name);
    
    Iterable<AdoptersModel> findByPreferPetType(String preferredPetType);
}
