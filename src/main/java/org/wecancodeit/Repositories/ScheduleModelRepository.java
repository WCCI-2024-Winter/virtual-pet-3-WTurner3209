package org.wecancodeit.Repositories;


import org.springframework.data.repository.CrudRepository;

import org.wecancodeit.Models.ScheduleModel;

public interface ScheduleModelRepository extends CrudRepository<ScheduleModel, Long>{

    Iterable<ScheduleModel> findByVolunteerID(Long volunteerId);
    Iterable<ScheduleModel> findByPetID(Long petId);
    Iterable<ScheduleModel> findByTaskID(Long taskId);
}
