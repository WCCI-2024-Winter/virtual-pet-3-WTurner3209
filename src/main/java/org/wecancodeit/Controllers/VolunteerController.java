package org.wecancodeit.Controllers;

import org.springframework.web.bind.annotation.*;

import org.wecancodeit.Models.VolunteersModel;

import org.wecancodeit.Services.VolunteerService;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/v1/volunteers/")
public class VolunteerController {

    @Resource
    private final VolunteerService volunteerService;

    public VolunteerController(VolunteerService volunteerService) {
        this.volunteerService = volunteerService;
    }

    @GetMapping
    public Iterable<VolunteersModel> getAllVolunteers() {
        return volunteerService.findAll();
    }

    @GetMapping("{id}")
    public VolunteersModel getVolunteerId(@PathVariable Long id) {
        return volunteerService.findById(id);
    }

    

    @DeleteMapping("{id}")
    public boolean deleteVolunteer(@PathVariable Long id) {
        return volunteerService.deleteVolunteer(id);
    }

    @PostMapping
    public VolunteersModel addVolunteer(@RequestBody VolunteersModel volunteerModel) {

        return volunteerService.saveVolunteer(volunteerModel);
    }

    @PutMapping
    public VolunteersModel saveVolunteer(@RequestBody VolunteersModel volunteerModel) {

        return volunteerService.saveVolunteer(volunteerModel);
    }
}
