package org.wecancodeit.Models;

import java.util.ArrayList;


import org.wecancodeit.Models.Enums.PetHeathEnums;
import org.wecancodeit.Models.Enums.PetMoodEnums;
import org.wecancodeit.Models.Enums.PetTypeEnums;
import org.wecancodeit.Models.Enums.TempermentEnums;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

@Entity
@Table(name = "t_OrganicPet")
public class OrganicPetModel extends PetModel {

    @Column(length = 50, nullable = false)
    private String breed;
    @Min(0)
    @Max(25)
    private int petAge;
    private PetHeathEnums petHealth;
    private PetMoodEnums petMood;
    private TempermentEnums petTemperment;
    private boolean petFixed;

    @ManyToOne
    private ShelterModel shelterModel;

    /*
     * deflault construtor
     */
    public OrganicPetModel() {
        
    }

    /*
     * Parameter
     * 
     */
    public OrganicPetModel(String name, PetTypeEnums petType, String imageUrl, String breed,
            int petAge, PetHeathEnums petHealth, PetMoodEnums petMood, TempermentEnums petTemperment,
            boolean petFixed,  ArrayList <Long> maintenanceTaskIds, ArrayList <Long> scheduleTaskIds) {
        super(name, petType, imageUrl, maintenanceTaskIds, scheduleTaskIds );
        this.breed = breed;
        this.petAge = petAge;
        this.petHealth = petHealth;
        this.petMood = petMood;
        this.petTemperment = petTemperment;
        this.petFixed = petFixed;

    }
@JsonIgnore
    public void setShelterModel(ShelterModel shelterModel) {
        this.shelterModel = shelterModel;
    }

    public ShelterModel getShelterModel() {
        return shelterModel;
    }

    public String getBreed() {
        return breed;
    }

    public int getPetAge() {
        return petAge;
    }

    public PetHeathEnums getPetHealth() {
        return petHealth;
    }

    public PetMoodEnums getPetMood() {
        return petMood;
    }

    public TempermentEnums getPetTemperment() {
        return petTemperment;
    }

    public boolean isPetFixed() {
        return petFixed;
    }

    @Override
    public String toString() {
        return super.toString() + "OrganicPetModel [petBreed=" + breed + ", petAge=" + petAge + ", petHealth="
                + petHealth
                + ", petMood=" + petMood + ", petTemperment=" + petTemperment + ", petFixed=" + petFixed + "]";
    }

}
