package org.wecancodeit.Services;

import org.springframework.stereotype.Service;
import org.wecancodeit.Models.PetMaintenanceModel;

import org.wecancodeit.Repositories.PetMaintentanceRepository;

import java.util.*;
import jakarta.annotation.Resource;

@Service
public class PetMaintenaceService {
    @Resource
    private PetMaintentanceRepository petMaintentanceRepository;

    public PetMaintenaceService() {
    }

    public PetMaintenaceService(PetMaintentanceRepository petMaintentanceRepository) {
        this.petMaintentanceRepository = petMaintentanceRepository;
    }

    public Iterable<PetMaintenanceModel> findAll() {
        Iterable<PetMaintenanceModel> maintenance = new ArrayList<>();

        try {
            maintenance = petMaintentanceRepository.findAll();
        } catch (Exception ex) {
            throw ex;
        }
        return maintenance;
    }

    public PetMaintenanceModel findById(Long id) {
        PetMaintenanceModel maintenance = null;
        try {
            Optional<PetMaintenanceModel> optMaintenance = petMaintentanceRepository.findById(id);
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

            petMaintentanceRepository.deleteById(id);
            Optional<PetMaintenanceModel> optMaintenance = petMaintentanceRepository.findById(id);
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
                maintenance = petMaintentanceRepository.save(maintenance);
            }

        } catch (Exception ex) {
            throw ex;
        }
        return maintenance;
    }

}
