package org.wecancodeit.Models;

import org.wecancodeit.Models.Enums.PetTypeEnums;
import org.wecancodeit.Models.Enums.RoboticPetEnums;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
@Entity
@Table(name = "t_RoboticPet")
public class RoboticPetModel extends PetModel{
     @Column(length = 50, nullable = false)
    private String petModel;
    @Column(length = 50, nullable = false)
    private String petManufacturer;
    @Min(0)
    @Max(100)
    @Column(nullable = false)
    private int petEnergy;
    @Min(0)
    @Max(100)
    @Column(nullable = false)
    private int petOil;
    private RoboticPetEnums roboticHealth;
    
    /*
     * deflault construtor
     */
    
    public RoboticPetModel() {
        super();
    }

    public RoboticPetModel(String name, PetTypeEnums petType, String imageUrl, String petModel, String petManufacturer,
            @Min(0) @Max(100) int petEnergy, @Min(0) @Max(100) int petOil, RoboticPetEnums roboticHealth) {
        super(name, petType, imageUrl);
        this.petModel = petModel;
        this.petManufacturer = petManufacturer;
        this.petEnergy = petEnergy;
        this.petOil = petOil;
        this.roboticHealth = roboticHealth;
    }

    @Override
    public String toString() {
        return super.toString() +"RoboticPetModel [petModel=" + petModel + ", petManufacturer=" + petManufacturer + ", petEnergy="
                + petEnergy + ", petOil=" + petOil + ", roboticHealth=" + roboticHealth + "]";
    }
    

    

    
}
