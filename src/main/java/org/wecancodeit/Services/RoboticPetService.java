package org.wecancodeit.Services;



import java.util.*;

import org.springframework.stereotype.Service;
import org.wecancodeit.Models.RoboticPetModel;
import org.wecancodeit.Repositories.RoboticPetRepository;

import jakarta.annotation.Resource;
@Service
public class RoboticPetService {
@Resource
private RoboticPetRepository roboticPetRepository;

public RoboticPetService() {
}

public RoboticPetService(RoboticPetRepository roboticPetRepository) {
    this.roboticPetRepository = roboticPetRepository;
}
    public Iterable<RoboticPetModel> findAll() {
        Iterable<RoboticPetModel> robotic = new ArrayList<>();

        try {
            robotic = roboticPetRepository.findAll();
        } catch (Exception ex) {
            throw ex;
        }
        return robotic;
    }

    public RoboticPetModel findById(Long id) {
        RoboticPetModel robotic = null;
        try {
            Optional<RoboticPetModel> optRobotic = roboticPetRepository.findById(id);
            if (optRobotic.isPresent()) {
                robotic = optRobotic.get();
            }
        } catch (Exception ex) {
            throw ex;
        }
        return robotic;
    }

    public boolean deleteOrganic(Long id) {
        boolean result = false;
        try {

            roboticPetRepository.deleteById(id);
            Optional<RoboticPetModel> optRobotic = roboticPetRepository.findById(id);
            if (!optRobotic.isPresent()) {
                result = true;
            }
        } catch (Exception ex) {
            throw ex;
        }
        return result;
    }

    public RoboticPetModel saveRobotic(RoboticPetModel robotic) {
        try {
            if (BaseService.isValidRobotic(robotic)) {
                robotic = roboticPetRepository.save(robotic);
            }

        } catch (Exception ex) {
            throw ex;
        }
        return robotic;
    }

    public Iterable<RoboticPetModel> findByManufacturer(String name) {
        Iterable<RoboticPetModel> pet = new ArrayList<>();

        try {
            pet = roboticPetRepository.findByManufacturer(pet);

        } catch (Exception ex) {
            throw ex;
        }
        return pet;

    }

    
}
