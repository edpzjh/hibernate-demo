package com.bulain.hibernate.entity;
// Generated 2011-10-22 19:47:14 by Hibernate Tools 3.2.2.GA


import java.util.Date;

/**
 * Permission generated by hbm2java
 */
public class Permission  implements java.io.Serializable {


     /**
     * 
     */
    private static final long serialVersionUID = -1169641956884449022L;
    private Integer id;
     private String permission;
     private String createdBy;
     private Date createdAt;
     private String updatedBy;
     private Date updatedAt;

    public Permission() {
    }

    public Permission(String permission, String createdBy, Date createdAt, String updatedBy, Date updatedAt) {
       this.permission = permission;
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
    public String getPermission() {
        return this.permission;
    }
    
    public void setPermission(String permission) {
        this.permission = permission;
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

