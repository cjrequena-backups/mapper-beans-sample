package com.sample.entity;

import java.io.Serializable;


public class SampleEntity implements Serializable {
    private Integer idEntity;
    private String firstName;
    private String lastName;
    private String email;

    public SampleEntity() {

    }

    public SampleEntity(Integer idEntity, String firstName, String lastName, String email) {
        this.idEntity = idEntity;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Integer getIdEntity() {
        return idEntity;
    }

    public void setIdEntity(Integer idEntity) {
        this.idEntity = idEntity;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
