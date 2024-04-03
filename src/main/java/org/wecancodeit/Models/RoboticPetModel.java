package org.wecancodeit.Models;

import org.wecancodeit.Models.Enums.PetTypeEnums;
import org.wecancodeit.Models.Enums.RoboticPetEnums;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "t_RoboticPet")
public class RoboticPetModel extends PetModel {
    @Column(length = 50, nullable = false)
    private String model;
    @Column(length = 50, nullable = false)
    private String manufacturer;
  
    @Column(nullable = false)
    private int petEnergy;
   
    @Column(nullable = false)
    private int petOil;
    private RoboticPetEnums roboticHealth;
    @ManyToOne
    private ShelterModel shelterModel;

    /*
     * deflault construtor
     */

    public RoboticPetModel() {
    }

    public RoboticPetModel(String name, PetTypeEnums petType, String imageUrl, String model, String manufacturer,
            int petEnergy, int petOil, RoboticPetEnums roboticHealth) {
        super(name, petType, imageUrl );      
        this.model = model;
        this.manufacturer = manufacturer;
        this.petEnergy = petEnergy;
        this.petOil = petOil;
        this.roboticHealth = roboticHealth;

    }
    

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPetEnergy() {
        return petEnergy;
    }

    public int getPetOil() {
        return petOil;
    }

    public RoboticPetEnums getRoboticHealth() {
        return roboticHealth;
    }
@JsonIgnore
    public void setShelterModel(ShelterModel shelterModel) {
        this.shelterModel = shelterModel;
    }

    public ShelterModel getShelterModel() {
        return shelterModel;
    }

    @Override
    public String toString() {
        return super.toString() + "RoboticPetModel [model=" + model + ", manufacturer=" + manufacturer + ", petEnergy="
                + petEnergy
                + ", petOil=" + petOil + ", roboticHealth=" + roboticHealth + ", shelterModel=" + shelterModel + "]";
    }

}
