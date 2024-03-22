package org.wecancodeit.Services;

import org.springframework.stereotype.Service;

import org.wecancodeit.Models.ScheduleModel;
import org.wecancodeit.Repositories.ScheduleModelRepository;
import java.util.*;
import jakarta.annotation.Resource;

@Service

public class PetScheduleService {
    @Resource
    private ScheduleModelRepository scheduleModelRepository;

    public PetScheduleService() {
    }

    public PetScheduleService(ScheduleModelRepository scheduleModelRepository) {
        this.scheduleModelRepository = scheduleModelRepository;
    }

    public Iterable<ScheduleModel> findAll() {
        Iterable<ScheduleModel> schedule = new ArrayList<>();

        try {
            schedule = scheduleModelRepository.findAll();
        } catch (Exception ex) {
            throw ex;
        }
        return schedule;
    }

    public ScheduleModel findById(Long id) {
        ScheduleModel schedule = null;
        try {
            Optional<ScheduleModel> optSchedule = scheduleModelRepository.findById(id);
            if (optSchedule.isPresent()) {
                schedule = optSchedule.get();
            }
        } catch (Exception ex) {
            throw ex;
        }
        return schedule;
    }

    public Iterable<ScheduleModel> findByVolunteerId(Long volunteerId) {
        Iterable<ScheduleModel> schedule = null;
        try {
            schedule = scheduleModelRepository.findByVolunteerId(volunteerId);
        } catch (Exception ex) {
            throw ex;
        }
        return schedule;
    }

    public Iterable<ScheduleModel> findByPetId(Long petId) {
        Iterable<ScheduleModel> schedule = null;
        try {
            schedule = scheduleModelRepository.findByPetId(petId);
        } catch (Exception ex) {
            throw ex;
        }
        return schedule;
    }

    public Iterable<ScheduleModel> findByTaskId(Long taskId) {
        Iterable<ScheduleModel> schedule = null;
        try {
            schedule = scheduleModelRepository.findByTaskId(taskId);
        } catch (Exception ex) {
            throw ex;
        }
        return schedule;
    }

    public boolean deleteSchedule(Long id) {
        boolean result = false;
        try {

            scheduleModelRepository.deleteById(id);
            Optional<ScheduleModel> optSchedule = scheduleModelRepository.findById(id);
            if (!optSchedule.isPresent()) {
                result = true;
            }
        } catch (Exception ex) {
            throw ex;
        }
        return result;
    }

    public ScheduleModel saveSchedule(ScheduleModel schedule) {
        try {
            if (BaseService.isValidSchedule(schedule)) {
                schedule = scheduleModelRepository.save(schedule);
            }

        } catch (Exception ex) {
            throw ex;
        }
        return schedule;
    }

    
}

