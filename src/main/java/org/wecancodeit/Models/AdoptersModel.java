package org.wecancodeit.Models;

import org.wecancodeit.Models.Enums.AdoptionsStatusEnum;
import org.wecancodeit.Models.Enums.PetTypeEnums;

import jakarta.persistence.*;

@Entity
@Table(name = "t_Adopters")
public class AdoptersModel extends ContactModel {
    private AdoptionsStatusEnum adoptionsStatus;
    private String notes;
    private PetTypeEnums preferPetType;
    @ManyToOne
    private ShelterModel shelterModel;
    
    public AdoptersModel() {
        super();
    }

    public AdoptersModel(String name, String address, String address2, String city, String state, String zip,
            String phoneNumber, String email, String imageURL, PetTypeEnums preferPetType) {
        super(name, address, address2, city, state, zip, phoneNumber, email, imageURL);
        this.preferPetType = preferPetType;
    }  
    public AdoptersModel(AdoptionsStatusEnum adoptionsStatus, String notes, PetTypeEnums preferPetType,
            ShelterModel shelterModel) {
        this.adoptionsStatus = adoptionsStatus;
        this.notes = notes;
        this.preferPetType = preferPetType;
        this.shelterModel = shelterModel;
    }

    public AdoptersModel(String name, String address, String address2, String city, String state, String zip,
            String phoneNumber, String email, String imageURL, ShelterModel shelterModel) {
        super(name, address, address2, city, state, zip, phoneNumber, email, imageURL);
        this.shelterModel = shelterModel;
    }

  

    public AdoptionsStatusEnum getAdoptionsStatus() {
        return adoptionsStatus;
    }

    public String getNotes() {
        return notes;
    }

    public ShelterModel getShelterModel() {
        return shelterModel;
    }

    
    public PetTypeEnums getPreferPetType() {
        return preferPetType;
    }

    @Override
    public String toString() {
        return super.toString() + "AdoptersModel [adoptionsStatus=" + adoptionsStatus + ", notes=" + notes + ", preferPetType="
                + preferPetType + ", shelterModel=" + shelterModel + "]";
    }

}
