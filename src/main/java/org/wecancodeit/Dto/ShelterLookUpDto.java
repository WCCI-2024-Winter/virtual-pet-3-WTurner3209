package org.wecancodeit.Dto;

import org.wecancodeit.Models.*;

public class ShelterLookUpDto {
    private String name;
    private long id;

    public ShelterLookUpDto() {
    }

    public ShelterLookUpDto(ShelterModel model) {
        this.name = model.getName();
        this.id = model.getId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
