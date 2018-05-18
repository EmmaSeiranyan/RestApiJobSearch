/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myrest.schema;

/**
 *
 * @author emma.seyranyan
 */
import javax.persistence.Entity;
import javax.persistence.Table;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Table(name = "spec")
@Document (collection = "spec")
public class Specialization {
    @Id private String id;
    private String title;

    public Specialization(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public Specialization() {
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    
}
