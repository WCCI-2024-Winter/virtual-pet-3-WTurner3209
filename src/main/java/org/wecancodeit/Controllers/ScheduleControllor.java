package org.wecancodeit.Controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wecancodeit.Models.ScheduleModel;
import org.wecancodeit.Services.PetScheduleService;

import jakarta.annotation.Resource;

@RestController
@RequestMapping("/api/v1/maintenance/")
public class ScheduleControllor {

    @Resource
    private final PetScheduleService petScheduleService;

    public ScheduleControllor(PetScheduleService petScheduleService) {
        this.petScheduleService = petScheduleService;
    }

    @GetMapping
    public Iterable<ScheduleModel> getAllSchedule() {
        return petScheduleService.findAll();
    }

    @GetMapping("{id}")
    public ScheduleModel getMaintenanceId(@PathVariable Long id) {
        return petScheduleService.findById(id);
    }

    @GetMapping("{petId}")
    public Iterable<ScheduleModel> getPetId(@PathVariable Long petId) {

        return petScheduleService.findByPetID(petId);
    }

    @GetMapping("{TaskId}")
    public Iterable<ScheduleModel> getTaskId(@PathVariable Long taskId) {
        return petScheduleService.findByTaskID(taskId);
    }

    @GetMapping("{volunteerId}")
    public Iterable<ScheduleModel> getVolunteerId(@PathVariable Long volunteerId) {
        return petScheduleService.findByVolunteerID(volunteerId);
    }

    @DeleteMapping("{id}")
    public boolean deleteSchedule(@PathVariable Long id) {
        return petScheduleService.deleteSchedule(id);
    }

    @PostMapping
    public ScheduleModel addSchedule(@RequestBody ScheduleModel scheduleModel) {

        return petScheduleService.saveSchedule(scheduleModel);
    }

    @PutMapping
    public ScheduleModel saveSchedule(@RequestBody ScheduleModel scheduleModel) {

        return petScheduleService.saveSchedule(scheduleModel);
    }
}