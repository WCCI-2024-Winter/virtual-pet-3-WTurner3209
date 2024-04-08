package org.wecancodeit.Services;

import org.springframework.stereotype.Service;
import org.wecancodeit.Models.PetMaintenanceModel;

import org.wecancodeit.Repositories.PetMaintenanceRepository;

import java.util.*;
import jakarta.annotation.Resource;

@Service
public class PetMaintenanceService {
    @Resource
    private PetMaintenanceRepository petMaintenanceRepository;

    public PetMaintenanceService() {
    }

    public PetMaintenanceService(PetMaintenanceRepository petMaintenanceRepository) {
        this.petMaintenanceRepository = petMaintenanceRepository;
    }

    public Iterable<PetMaintenanceModel> findAll() {
        Iterable<PetMaintenanceModel> maintenance = new ArrayList<>();

        try {
            maintenance = petMaintenanceRepository.findAll();
        } catch (Exception ex) {
            throw ex;
        }
        return maintenance;
    }

    public PetMaintenanceModel findById(Long id) {
        PetMaintenanceModel maintenance = null;
        try {
            Optional<PetMaintenanceModel> optMaintenance = petMaintenanceRepository.findById(id);
            if (optMaintenance.isPresent()) {
                maintenance = optMaintenance.get();
            }
        } catch (Exception ex) {
            throw ex;
        }
        return maintenance;
    }

    public boolean deleteMaintenance(Long id) {
        boolean result = false;
        try {

            petMaintenanceRepository.deleteById(id);
            Optional<PetMaintenanceModel> optMaintenance = petMaintenanceRepository.findById(id);
            if (!optMaintenance.isPresent()) {
                result = true;
            }
        } catch (Exception ex) {
            throw ex;
        }
        return result;
    }

    public PetMaintenanceModel saveMaintenance(PetMaintenanceModel maintenance) {
        try {
            if (BaseService.isValidMaintenance(maintenance)) {
                maintenance = petMaintenanceRepository.save(maintenance);
            }

        } catch (Exception ex) {
            throw ex;
        }
        return maintenance;
    }
    public Iterable<PetMaintenanceModel> findByName (String name) {
        Iterable<PetMaintenanceModel> petMaintenance = new ArrayList<>();
        try {
            petMaintenance = petMaintenanceRepository.findByName(name);

        } catch (Exception ex) {
            throw ex;
        }
        return petMaintenance;

        
    }

}
