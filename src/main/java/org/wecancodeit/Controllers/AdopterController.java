package org.wecancodeit.Controllers;

import org.springframework.web.bind.annotation.*;
import org.wecancodeit.Models.AdoptersModel;
import org.wecancodeit.Services.AdopterService;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/v1/adopters/")
public class AdopterController {

    @Resource
    private final AdopterService adopterService;

    public AdopterController(AdopterService adopterService) {
        this.adopterService = adopterService;
    }

    @GetMapping
    public Iterable<AdoptersModel> getAllAdopters() {
        return adopterService.findAll();
    }

    @GetMapping("{id}")
    public AdoptersModel getAdoptersId(@PathVariable Long id) {
        return adopterService.findById(id);
    }

    @GetMapping("name/{name}")
    public Iterable<AdoptersModel> getName(@PathVariable String name) {
        return adopterService.findByName(name);
    }

    @DeleteMapping("{id}")
    public boolean deleteAdopter(@PathVariable Long id) {
        return adopterService.deleteAdopter(id);
    }

    @PostMapping
    public AdoptersModel addAdopters(@RequestBody AdoptersModel adopterModel) {

        return adopterService.saveAdopter(adopterModel);
    }

    @PutMapping
    public AdoptersModel saveAdopters(@RequestBody AdoptersModel adopterModel) {

        return adopterService.saveAdopter(adopterModel);
    }

}
