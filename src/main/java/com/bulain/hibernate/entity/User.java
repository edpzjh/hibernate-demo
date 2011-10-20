package com.bulain.hibernate.entity;
// Generated 2011-10-18 22:26:13 by Hibernate Tools 3.2.2.GA

import java.util.Date;

/**
 * Users generated by hbm2java
 */
public class User implements java.io.Serializable {
    private static final long serialVersionUID = -5641975443121923005L;

    private Integer id;
    private String firstName;
    private String lastName;
    private String createdBy;
    private Date createdAt;
    private String updatedBy;
    private Date updatedAt;

    public User() {
    }

    public User(String firstName, String lastName, String createdBy, Date createdAt, String updatedBy, Date updatedAt) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.updatedBy = updatedBy;
        this.updatedAt = updatedAt;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}