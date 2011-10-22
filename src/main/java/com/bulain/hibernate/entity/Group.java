package com.bulain.hibernate.entity;
// Generated 2011-10-22 19:47:14 by Hibernate Tools 3.2.2.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Group generated by hbm2java
 */
public class Group  implements java.io.Serializable {


     /**
     * 
     */
    private static final long serialVersionUID = -6453210882712090077L;
    private Integer id;
     private String name;
     private String note;
     private String createdBy;
     private Date createdAt;
     private String updatedBy;
     private Date updatedAt;
     private Set<GroupUser> groupUserses = new HashSet<GroupUser>(0);
     private Set<GroupPermission> groupPermissionses = new HashSet<GroupPermission>(0);

    public Group() {
    }

    public Group(String name, String note, String createdBy, Date createdAt, String updatedBy, Date updatedAt, Set<GroupUser> groupUserses, Set<GroupPermission> groupPermissionses) {
       this.name = name;
       this.note = note;
       this.createdBy = createdBy;
       this.createdAt = createdAt;
       this.updatedBy = updatedBy;
       this.updatedAt = updatedAt;
       this.groupUserses = groupUserses;
       this.groupPermissionses = groupPermissionses;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
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
    public Set<GroupUser> getGroupUserses() {
        return this.groupUserses;
    }
    
    public void setGroupUserses(Set<GroupUser> groupUserses) {
        this.groupUserses = groupUserses;
    }
    public Set<GroupPermission> getGroupPermissionses() {
        return this.groupPermissionses;
    }
    
    public void setGroupPermissionses(Set<GroupPermission> groupPermissionses) {
        this.groupPermissionses = groupPermissionses;
    }




}


