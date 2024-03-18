package org.wecancodeit.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.Models.PetMaintenanceModel;

public interface PetTaskRepository extends CrudRepository<PetMaintenanceModel, Long> {
    
}
