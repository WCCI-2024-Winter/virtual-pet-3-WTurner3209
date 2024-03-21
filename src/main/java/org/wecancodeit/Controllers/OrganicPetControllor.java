package org.wecancodeit.Controllers;

import org.springframework.web.bind.annotation.*;
import org.wecancodeit.Models.OrganicPetModel;
import org.wecancodeit.Services.OrganicPetService;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/v1/organicPet/")
public class OrganicPetControllor {

    @Resource
    private final OrganicPetService organicPetService;

    public OrganicPetControllor(OrganicPetService organicPetService) {
        this.organicPetService = organicPetService;
    }

    @GetMapping
    public Iterable<OrganicPetModel> getAllOrganicPet() {
        return organicPetService.findAll();
    }

    @GetMapping("{breed}")
    public Iterable<OrganicPetModel> getOrganicPetByBreed(@PathVariable String breed) {
        return organicPetService.findByBreed(breed);
    }
    @DeleteMapping("{id}")
    public boolean deleteOrganicPet(@PathVariable Long id) {
        return organicPetService.deleteOrganic(id);
    }

    @PostMapping
    public OrganicPetModel addOrganicPet(@RequestBody OrganicPetModel organicPetModel) {

        return organicPetService.saveOrganic(organicPetModel);
    }

    @PutMapping
    public OrganicPetModel saveOrganicPet(@RequestBody OrganicPetModel organicPetModel) {

        return organicPetService.saveOrganic(organicPetModel);
    }
}
