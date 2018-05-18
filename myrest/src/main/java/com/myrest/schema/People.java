/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myrest.schema;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author emma.seyranyan
 */
@Entity
@Document (collection="person")
public class People implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected String id;
    protected String name;
    protected String city;

    public People() {
    }

    public People(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    
}
