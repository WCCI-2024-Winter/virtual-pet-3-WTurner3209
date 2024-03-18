package org.wecancodeit.Models;

import java.util.ArrayList;

import org.wecancodeit.Models.Enums.PetHeathEnums;
import org.wecancodeit.Models.Enums.PetMoodEnums;
import org.wecancodeit.Models.Enums.PetTypeEnums;
import org.wecancodeit.Models.Enums.TempermentEnums;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

@Entity
@Table(name = "t_OrganicPet")
public class OrganicPetModel extends PetModel {

    @Column(length = 50, nullable = false)
    private String petBreed;
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
        super();
    }

    /*
     * Parameter
     * 
     */
    public OrganicPetModel(String name, PetTypeEnums petType, String imageUrl, String petBreed,
            int petAge, PetHeathEnums petHealth, PetMoodEnums petMood, TempermentEnums petTemperment,
            boolean petFixed,  ArrayList <Long> maintenanceTaskIds, ArrayList <Long> scheduleTaskIds) {
        super(name, petType, imageUrl, maintenanceTaskIds, scheduleTaskIds );
        this.petBreed = petBreed;
        this.petAge = petAge;
        this.petHealth = petHealth;
        this.petMood = petMood;
        this.petTemperment = petTemperment;
        this.petFixed = petFixed;

    }

    public String getPetBreed() {
        return petBreed;
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
        return super.toString() + "OrganicPetModel [petBreed=" + petBreed + ", petAge=" + petAge + ", petHealth="
                + petHealth
                + ", petMood=" + petMood + ", petTemperment=" + petTemperment + ", petFixed=" + petFixed + "]";
    }

}