package org.wecancodeit.Services;

import java.util.ArrayList;
import java.util.Optional;
import org.wecancodeit.Dto.*;
import org.springframework.stereotype.Service;
import org.wecancodeit.Models.ShelterModel;
import org.wecancodeit.Repositories.ShelterRepository;

import jakarta.annotation.Resource;

@Service
public class ShelterService {

    @Resource
    private ShelterRepository shelterRepository;

    public ShelterService() {
    }

    public ShelterService(ShelterRepository shelterRepository) {
        this.shelterRepository = shelterRepository;
    }
    public Iterable<ShelterLookUpDto> getLookUP() {
        ArrayList<ShelterLookUpDto> lookup = new ArrayList<>();

        try {
            Iterable<ShelterModel> shelters = shelterRepository.findAll();
         for (ShelterModel shelter : shelters){
            lookup.add(new ShelterLookUpDto(shelter));
         }   
        } catch (Exception ex) {
            throw ex;
        }
        return lookup;
    }

    public Iterable<ShelterModel> findAll() {
        Iterable<ShelterModel> shelters = new ArrayList<>();

        try {
            shelters = shelterRepository.findAll();
        } catch (Exception ex) {
            throw ex;
        }
        return shelters;
    }

    public ShelterModel findById(Long id) {
        ShelterModel shelter = null;
        try {
            Optional<ShelterModel> optShelter = shelterRepository.findById(id);
            if (optShelter.isPresent()) {
                shelter = optShelter.get();
            }
        } catch (Exception ex) {
            throw ex;
        }
        return shelter;
    }

    public boolean deleteShelter(Long id) {
        boolean result = false;
        try {

            shelterRepository.deleteById(id);
            Optional<ShelterModel> optShelter = shelterRepository.findById(id);
            if (!optShelter.isPresent()) {
                result = true;
            }
        } catch (Exception ex) {
            throw ex;
        }
        return result;
    }

    public ShelterModel saveShelter(ShelterModel shelter) {
        try {
            if (BaseService.isValidContact(shelter)) {
                shelter = shelterRepository.save(shelter);
            }

        } catch (Exception ex) {
            throw ex;
        }
        return shelter;
    }

    public Iterable<ShelterModel> findByName(String name) {
        Iterable<ShelterModel> shelter = new ArrayList<>();

        try {
            shelter = shelterRepository.findByName(name);
        } catch (Exception ex) {
            throw ex;
        }
        return shelter;
    }

    public Iterable<ShelterModel> findByZip(String zip) {
        Iterable<ShelterModel> shelter = new ArrayList<>();

        try {
            if (zip != null && zip.length() > 2) {
                zip = zip.substring(0, 2);
            }
        } catch (Exception ex) {
            throw ex;
        }
        return shelter;
    }

}
