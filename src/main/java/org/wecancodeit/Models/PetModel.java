package org.wecancodeit.Models;

import org.wecancodeit.Models.Enums.PetTypeEnums;

import jakarta.persistence.*;
@MappedSuperclass
public abstract class PetModel  {
    @Id
    @GeneratedValue()
    private long id;
    @Column(length = 50, nullable=false)
    private String name;
    private PetTypeEnums petType;
    private String imageUrl;

    public PetModel() {
    }

    public PetModel(String name, PetTypeEnums petType, String imageUrl) {
        this.name = name;
        this.petType = petType;
        this.imageUrl = imageUrl;
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

    public PetTypeEnums getPetType() {
        return petType;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public String toString() {
        return "PetModel [id=" + id + ", name=" + name + ", petType=" + petType + ", imageUrl=" + imageUrl + "]";
    }
    
    

}
