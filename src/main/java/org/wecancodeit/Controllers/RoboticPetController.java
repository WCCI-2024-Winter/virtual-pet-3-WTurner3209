package org.wecancodeit.Controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wecancodeit.Models.RoboticPetModel;
import org.wecancodeit.Services.RoboticPetService;

import jakarta.annotation.Resource;

@RestController
@RequestMapping("/api/v1/roboticPet/")
public class RoboticPetController {

    @Resource
    private final RoboticPetService roboticPetService;

    public RoboticPetController(RoboticPetService roboticPetService) {
        this.roboticPetService = roboticPetService;
    }

    @GetMapping
    public Iterable<RoboticPetModel> getAllRoboticPet() {
        return roboticPetService.findAll();
    }

    @GetMapping("manufacturer/{manufacturer}")
    public Iterable<RoboticPetModel> getRoboticPet(@PathVariable String manufacturer) {
        return roboticPetService.findByManufacturer(manufacturer);
    }
    @DeleteMapping("{id}")
    public boolean deleteRobotic(@PathVariable Long id) {
        return roboticPetService.deleteRoboticPet(id);
    }

    @PostMapping
    public RoboticPetModel addRoboticPet(@RequestBody RoboticPetModel roboticPetModel) {

        return roboticPetService.saveRobotic(roboticPetModel);
    }

    @PutMapping
    public RoboticPetModel saveRobotic(@RequestBody RoboticPetModel roboticPetModel) {

        return roboticPetService.saveRobotic(roboticPetModel);
    }
}
