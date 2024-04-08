package org.wecancodeit.Models;

import java.util.*;

import jakarta.persistence.*;

@Entity
@Table(name = "t_Shelter")
public class ShelterModel extends ContactModel {
    private String webSite;

    @OneToMany(mappedBy = "shelterModel", cascade = CascadeType.ALL)
    private Collection<OrganicPetModel> organicPets;

    @OneToMany(mappedBy = "shelterModel", cascade = CascadeType.ALL)
    private Collection<RoboticPetModel> roboticPets;

    @OneToMany(mappedBy = "shelterModel", cascade = CascadeType.ALL)
    private Collection<AdoptersModel> adopters;

    @ManyToMany
    @JoinTable(name = "shelter_volunteers", joinColumns = @JoinColumn(name = "shelter_id"), inverseJoinColumns = @JoinColumn(name = "volunteer_id"))
    private Collection<VolunteersModel> volunteers;

    public ShelterModel() {
        super();

    }

    public ShelterModel(String name, String address, String address2, String city, String state,
            String zip, String phoneNumber, String email, String imageURL, String webSite) {
        super(name, address, address2, city, state, zip, phoneNumber, email, imageURL);
        this.webSite = webSite;
    }

    public Collection<AdoptersModel> getAdopters() {
        return adopters;
    }

    public Collection<VolunteersModel> getVolunteers() {
        return volunteers;
    }

    public Collection<OrganicPetModel> getOrganicPets() {
        return organicPets;
    }

    public Collection<RoboticPetModel> getRoboticPets() {
        return roboticPets;
    }

    public String getWebSite() {
        return webSite;
    }

    @Override
    public String toString() {
        return super.toString() + "ShelterModel [webSite=" + webSite + ", organicPets=" + organicPets
                + ", roboticModel=" + roboticPets
                + "]";
    }

}
