/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myrest.schema;

import com.myrest.entities.DomainObject;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author emma.seyranyan
 */
@Entity
@Table(name = "person")
@Document(collection = "person" )
public class Person extends People implements Serializable {
    private String phone;
    private String mail;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public Person(String phone, String mail, String name, String city) {
        super(name, city);
        this.phone = phone;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    
}
