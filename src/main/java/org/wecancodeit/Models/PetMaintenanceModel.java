package org.wecancodeit.Models;

import org.wecancodeit.Models.Enums.PetTaskEnums;
import org.wecancodeit.Models.Enums.PetTypeEnums;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "t_PetMaintenance")
public class PetMaintenanceModel {
    @Id
    @GeneratedValue
    private long id;
    @Column(length = 50, nullable = false)
    private String name;
    @Min(0)
    @Max(1464)

    private int frequency;
    private PetTypeEnums petType;
    private PetTaskEnums taskEnums;

    public PetMaintenanceModel(String name, int frequency, PetTypeEnums petType, PetTaskEnums taskEnums) {
        this.name = name;
        this.frequency = frequency;
        this.petType = petType;
        this.taskEnums = taskEnums;
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    public PetTypeEnums getPetType() {
        return petType;
    }

    public PetTaskEnums getEffectedProperty() {
        return taskEnums;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString() + "PetMaintenanceModel [id=" + id + ", name=" + name + ", frequency=" + frequency
                + ", petType=" + petType
                + ", taskEnums=" + taskEnums + "]";
    }

}
