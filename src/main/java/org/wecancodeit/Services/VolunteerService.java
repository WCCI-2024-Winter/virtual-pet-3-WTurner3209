package org.wecancodeit.Services;

import org.springframework.stereotype.Service;
import org.wecancodeit.Models.*;
import org.wecancodeit.Repositories.VolunteerRepository;
import java.util.*;
import jakarta.annotation.Resource;

@Service
public class VolunteerService {
    
    @Resource
    private VolunteerRepository volunteerRepository;

    public VolunteerService() {
    }

    public VolunteerService(VolunteerRepository volunteerRepository) {
        this.volunteerRepository = volunteerRepository;
    }

    public Iterable<VolunteersModel> findAll() {
        Iterable<VolunteersModel> volunteers = new ArrayList<>();

        try {
            volunteers = volunteerRepository.findAll();
        } catch (Exception ex) {
            throw ex;
        }
        return volunteers;
    }
    public VolunteersModel findById(Long id) {
        VolunteersModel volunteers = null;
        try {
            Optional<VolunteersModel> optVolunteers = volunteerRepository.findById(id);
            if (optVolunteers.isPresent()) {
                volunteers = optVolunteers.get();
            }
        } catch (Exception ex) {
            throw ex;
        }
        return volunteers;
    }
    
    public boolean deleteVolunteer(Long id) {
        boolean result = false;
        try {

            volunteerRepository.deleteById(id);
            Optional<VolunteersModel> optVolunteers = volunteerRepository.findById(id);
            if (!optVolunteers.isPresent()) {
                result = true;
            }
        } catch (Exception ex) {
            throw ex;
        }
        return result;
    }
    public VolunteersModel saveVolunteer(VolunteersModel volunteer) {
        try {
            if (BaseService.isValidContact(volunteer)) {
                volunteer = volunteerRepository.save(volunteer);
            }

        } catch (Exception ex) {
            throw ex;
        }
        return volunteer;
    }
}
