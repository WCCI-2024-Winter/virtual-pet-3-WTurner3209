package org.wecancodeit.Models;

import org.wecancodeit.Models.Enums.PetTaskEnums;

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
    private PetTaskEnums petType;
    private PetTaskEnums effectedProperty;

    public PetMaintenanceModel() {
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    public PetTaskEnums getPetType() {
        return petType;
    }

    public PetTaskEnums getEffectedProperty() {
        return effectedProperty;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString() + "PetMaintenanceModel [id=" + id + ", name=" + name + ", frequency=" + frequency
                + ", petType=" + petType
                + ", effectedProperty=" + effectedProperty + "]";
    }

}
