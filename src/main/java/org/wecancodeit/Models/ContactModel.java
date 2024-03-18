package org.wecancodeit.Models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

@MappedSuperclass

public abstract class ContactModel {
     @Id
    @GeneratedValue()
    
    
    private long id;
    @Column(length = 50, nullable=false)
    private String name;
    @Column(length = 150, nullable = false)
    private String address;
    @Column(length = 150, nullable = true)
    private String address2;
    @Column(length = 50, nullable = true)
    private String city;
    @Column(length = 2, nullable = true)
    private String state;
    @Column(length = 10, nullable = false)
    @Min(5)
    @Max(10)
    private String zip;
    @Column(length = 10, nullable = true)
    private String phoneNumber;
    @Column(length = 150, nullable = false)
    private String email;

    private String imageURL;

    public ContactModel() {
    }

    public ContactModel(String name, String address, String address2, String city, String state,
            String zip, String phoneNumber, String email, String imageURL) {
        this.name = name;
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.imageURL = imageURL;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getImageURL() {
        return imageURL;
    }

    @Override
    public String toString() {
        return "ContactModel [id=" + id + ", name=" + name + ", address=" + address + ", address2=" + address2
                + ", city=" + city + ", state=" + state + ", zip=" + zip + ", phoneNumber=" + phoneNumber + ", email="
                + email + ", imageURL=" + imageURL + "]";
    }

    
}
