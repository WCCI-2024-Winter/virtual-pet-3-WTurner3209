package org.wecancodeit.Repositories;


import org.springframework.data.repository.CrudRepository;

import org.wecancodeit.Models.ScheduleModel;

public interface ScheduleModelRepository extends CrudRepository<ScheduleModel, Long>{

    Iterable<ScheduleModel> findByVolunteerID(Long volunteerID);
    Iterable<ScheduleModel> findByPetID(Long petID);
    Iterable<ScheduleModel> findByTaskID(Long taskID);
}
