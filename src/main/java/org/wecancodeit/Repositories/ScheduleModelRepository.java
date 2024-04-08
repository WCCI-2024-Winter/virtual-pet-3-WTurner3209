package org.wecancodeit.Repositories;


import org.springframework.data.repository.CrudRepository;

import org.wecancodeit.Models.ScheduleModel;

public interface ScheduleModelRepository extends CrudRepository<ScheduleModel, Long>{

    Iterable<ScheduleModel> findByVolunteerId(Long volunteerId);
    Iterable<ScheduleModel> findByPetId(Long petId);
    Iterable<ScheduleModel> findByTaskId(Long taskId);
}
