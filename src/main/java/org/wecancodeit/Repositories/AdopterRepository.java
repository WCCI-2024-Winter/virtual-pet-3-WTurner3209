package org.wecancodeit.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.Models.AdoptersModel;



public interface AdopterRepository extends CrudRepository<AdoptersModel, Long> {


    Iterable<AdoptersModel> findByName(String name);
    Iterable<AdoptersModel> findByNameZip(String name, String zip);
    Iterable<AdoptersModel> findByPreferPetType(String preferredPetType);
    Iterable<AdoptersModel> findByPreferPetTypeZip(String zip);
    
}
