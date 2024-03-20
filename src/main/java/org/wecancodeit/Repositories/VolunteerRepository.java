package org.wecancodeit.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.Models.VolunteersModel;

public interface VolunteerRepository extends CrudRepository<VolunteersModel, Long>{
    Iterable<VolunteersModel> findByName(String name);
    Iterable<VolunteersModel> findByNameZip(String name, String zip);
}
