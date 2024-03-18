package org.wecancodeit.Models;

import java.util.ArrayList;

import org.wecancodeit.Models.Enums.PetTypeEnums;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class PetModel {
    @Id
    @GeneratedValue()
    private long id;
    @Column(length = 50, nullable = false)
    private String name;
    private PetTypeEnums petType;
    private String imageUrl;
    private ArrayList<Long> maintenanceTaskIds;
    private ArrayList<Long> scheduleTaskIds;


    public PetModel() {
    }

    public PetModel(String name, PetTypeEnums petType, String imageUrl, ArrayList <Long> maintenanceTaskIds, ArrayList<Long> scheduleTaskIds) {
        this.name = name;
        this.petType = petType;
        this.imageUrl = imageUrl;
        this.maintenanceTaskIds = maintenanceTaskIds;
        this.scheduleTaskIds = scheduleTaskIds;
    }

    public long getId() {
        return id;
    }

    public ArrayList<Long> getMaintenanceTaskIds() {
        return maintenanceTaskIds;
    }

    public ArrayList<Long> getScheduleTaskIds() {
        return scheduleTaskIds;
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
