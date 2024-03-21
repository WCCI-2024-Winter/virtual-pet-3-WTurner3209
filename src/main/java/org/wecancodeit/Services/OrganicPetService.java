package org.wecancodeit.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.wecancodeit.Models.OrganicPetModel;

import org.wecancodeit.Repositories.*;

import jakarta.annotation.Resource;

@Service
public class OrganicPetService {
    @Resource
    private OrganicPetRepository organicPetRepository;

    public OrganicPetService() {

    }

    public OrganicPetService(OrganicPetRepository organicPetRepository) {
        this.organicPetRepository = organicPetRepository;
    }

    public Iterable<OrganicPetModel> findAll() {
        Iterable<OrganicPetModel> organic = new ArrayList<>();

        try {
            organic = organicPetRepository.findAll();
        } catch (Exception ex) {
            throw ex;
        }
        return organic;
    }

    public OrganicPetModel findById(Long id) {
        OrganicPetModel organic = null;
        try {
            Optional<OrganicPetModel> optOrganic = organicPetRepository.findById(id);
            if (optOrganic.isPresent()) {
                organic = optOrganic.get();
            }
        } catch (Exception ex) {
            throw ex;
        }
        return organic;
    }

    public boolean deleteOrganic(Long id) {
        boolean result = false;
        try {

            organicPetRepository.deleteById(id);
            Optional<OrganicPetModel> optOrganic = organicPetRepository.findById(id);
            if (!optOrganic.isPresent()) {
                result = true;
            }
        } catch (Exception ex) {
            throw ex;
        }
        return result;
    }

    public OrganicPetModel saveOrganic(OrganicPetModel organic) {
        try {
            if (BaseService.isValidOrganic(organic)) {
                organic = organicPetRepository.save(organic);
            }

        } catch (Exception ex) {
            throw ex;
        }
        return organic;
    }

    public Iterable<OrganicPetModel> findByBreed(String breed) {
        Iterable<OrganicPetModel> organicPets = new ArrayList<>();

        try {
            organicPets = organicPetRepository.findByBreed(breed);

        } catch (Exception ex) {
            throw ex;
        }
        return organicPets;

    }

}
