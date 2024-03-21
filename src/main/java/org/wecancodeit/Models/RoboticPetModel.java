package org.wecancodeit.Models;

import java.util.ArrayList;

import org.wecancodeit.Models.Enums.PetTypeEnums;
import org.wecancodeit.Models.Enums.RoboticPetEnums;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

@Entity
@Table(name = "t_RoboticPet")
public class RoboticPetModel extends PetModel {
    @Column(length = 50, nullable = false)
    private String model;
    @Column(length = 50, nullable = false)
    private String manufacturer;
    @Min(0)
    @Max(100)
    @Column(nullable = false)
    private int petEnergy;
    @Min(0)
    @Max(100)
    @Column(nullable = false)
    private int petOil;
    private RoboticPetEnums roboticHealth;
    @ManyToOne
    private ShelterModel shelterModel;

    /*
     * deflault construtor
     */

    public RoboticPetModel() {
        super();
    }

    public RoboticPetModel(String name, PetTypeEnums petType, String imageUrl, String model, String manufacturer,
            @Min(0) @Max(100) int petEnergy, @Min(0) @Max(100) int petOil, RoboticPetEnums roboticHealth,
            ArrayList<Long> scheduleTaskIds, ArrayList<Long> maintenanceTaskIds) {
        super(name, petType, imageUrl, maintenanceTaskIds, scheduleTaskIds);
        this.model = model;
        this.manufacturer = manufacturer;
        this.petEnergy = petEnergy;
        this.petOil = petOil;
        this.roboticHealth = roboticHealth;
    }

    @Override
    public String toString() {
        return super.toString() + "RoboticPetModel [petModel=" + model + ", petManufacturer=" + manufacturer
                + ", petEnergy="
                + petEnergy + ", petOil=" + petOil + ", roboticHealth=" + roboticHealth + "]";
    }

}
