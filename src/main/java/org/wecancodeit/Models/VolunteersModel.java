package org.wecancodeit.Models;

import java.util.*;

import jakarta.persistence.*;

@Entity
@Table(name = "t_Volunteer")
public class VolunteersModel extends ContactModel {

    @ManyToMany(mappedBy = "volunteers")
    private Collection<ShelterModel> shelterModel;

    public VolunteersModel() {
        super();
    }

    public VolunteersModel(String name, String address, String address2, String city, String state,
            String zip, String phoneNumber, String email, String imageURL) {
        super(name, address, address2, city, state, zip, phoneNumber, email, imageURL);
    }

}
