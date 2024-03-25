package org.wecancodeit.Controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wecancodeit.Models.PetMaintenanceModel;
import org.wecancodeit.Services.PetMaintenanceService;

import jakarta.annotation.Resource;

@RestController
@RequestMapping("/api/v1/maintenance/")
public class PetMaintenanceController {

    @Resource
    private final PetMaintenanceService petMaintenanceService;

    public PetMaintenanceController(PetMaintenanceService petMaintenanceService) {
        this.petMaintenanceService = petMaintenanceService;
    }

    @GetMapping
    public Iterable<PetMaintenanceModel> getAllMaintenance() {
        return petMaintenanceService.findAll();
    }

    @GetMapping("{id}")
    public PetMaintenanceModel getMaintenanceId(@PathVariable Long id) {
        return petMaintenanceService.findById(id);
    }

    @GetMapping("name/{name}")
    public Iterable<PetMaintenanceModel> getName(@PathVariable String name) {
        return petMaintenanceService.findByName(name);
    }

    @DeleteMapping("{id}")
    public boolean deleteMaintenance(@PathVariable Long id) {
        return petMaintenanceService.deleteMaintenance(id);
    }

    @PostMapping
    public PetMaintenanceModel addMaintenance(@RequestBody PetMaintenanceModel petMaintenanceModel) {

        return petMaintenanceService.saveMaintenance(petMaintenanceModel);
    }

    @PutMapping
    public PetMaintenanceModel saveMaintenance(@RequestBody PetMaintenanceModel petMaintenanceModel) {

        return petMaintenanceService.saveMaintenance(petMaintenanceModel);
    }
}
