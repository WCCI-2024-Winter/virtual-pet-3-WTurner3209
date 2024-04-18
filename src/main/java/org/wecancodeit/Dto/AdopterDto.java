package org.wecancodeit.Dto;

import org.wecancodeit.Models.Enums.*;
import org.wecancodeit.Models.*;
public class AdopterDto {
    private long id;

    private String name;

    private String address;

    private String address2;

    private String city;

    private String state;

    // @Size(max = 10, min = 5)
    private String zip;

    private String phoneNumber;

    private String email;

    private String imageURL;
    private AdoptionsStatusEnum adoptionsStatus;
    private String notes;
    private PetTypeEnums preferPetType;
    private ShelterModel shelterModel;
    private long shelter_id;


    
    public AdopterDto() {
    }
    
    public AdopterDto(AdoptersModel model) {
        this.id = model.getId();
        this.name = model.getName();
        this.address = model.getAddress();
        this.address2 = model.getAddress2();
        this.city = model.getCity();
        this.state = model.getState();
        this.zip = model.getZip();
        this.phoneNumber = model.getPhoneNumber();
        this.email = model.getEmail();
        this.imageURL = model.getImageURL();
        this.adoptionsStatus = model.getAdoptionsStatus();
        this.notes = model.getNotes();
        this.preferPetType = model.getPreferPetType();
        this.shelterModel = model.getShelterModel();
        this.shelter_id = model.getId();
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress2() {
        return address2;
    }
    public void setAddress2(String address2) {
        this.address2 = address2;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getImageURL() {
        return imageURL;
    }
    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
    public AdoptionsStatusEnum getAdoptionsStatus() {
        return adoptionsStatus;
    }
    public void setAdoptionsStatus(AdoptionsStatusEnum adoptionsStatus) {
        this.adoptionsStatus = adoptionsStatus;
    }
    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }
    public PetTypeEnums getPreferPetType() {
        return preferPetType;
    }
    public void setPreferPetType(PetTypeEnums preferPetType) {
        this.preferPetType = preferPetType;
    }
    public ShelterModel getShelterModel() {
        return shelterModel;
    }
    public void setShelterModel(ShelterModel shelterModel) {
        this.shelterModel = shelterModel;
    }
    public long getShelter_id() {
        return shelter_id;
    }
    public void setShelter_id(long shelter_id) {
        this.shelter_id = shelter_id;
    }

    
}
