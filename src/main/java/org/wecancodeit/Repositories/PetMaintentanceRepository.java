package org.wecancodeit.Repositories;

import org.springframework.data.repository.CrudRepository;

import org.wecancodeit.Models.PetMaintenanceModel;


public interface PetMaintentanceRepository extends CrudRepository<PetMaintenanceModel, Long>{

    Iterable<PetMaintenanceModel> fineByName(String name);

}
