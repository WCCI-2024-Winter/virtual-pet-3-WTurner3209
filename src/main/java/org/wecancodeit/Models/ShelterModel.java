package org.wecancodeit.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "t_Shelter")
public  class ShelterModel extends ContactModel {
    private String webSite;

    public ShelterModel() {
    }

    public ShelterModel(String name, String address, String address2, String city, String state,
            String zip, String phoneNumber, String email, String imageURL, String webSite) {
        super(name, address, address2, city, state, zip, phoneNumber, email, imageURL);
        this.webSite = webSite;
    }

    public String getWebSite() {
        return webSite;
    }

    @Override
    public String toString() {
        return super.toString() + "ShelterModel [webSite=" + webSite + "]";
    }


}
