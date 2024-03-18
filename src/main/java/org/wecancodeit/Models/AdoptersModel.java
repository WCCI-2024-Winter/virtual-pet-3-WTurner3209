package org.wecancodeit.Models;

import org.wecancodeit.Models.Enums.PetTypeEnums;

import jakarta.persistence.*;

@Entity
@Table(name = "t_Adopters")
public class AdoptersModel extends ContactModel {

    public PetTypeEnums preferPetType;
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

    public PetTypeEnums getPreferPetType() {
        return preferPetType;
    }

    @Override
    public String toString() {
        return super.toString() + "AdoptersModel [preferPetType=" + preferPetType + "]";
    }

}
