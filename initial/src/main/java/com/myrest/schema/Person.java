/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myrest.schema;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author emma.seyranyan
 */
@Document(collection = "person" )
public class Person {
    @Id private String _id;
    private String name;
    private String phone;
    private String mail;
    private String city;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public Person(String id, String name, String phone, String mail, String city) {
        this._id = id;
        this.name = name;
        this.phone = phone;
        this.mail = mail;
        this.city = city;
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
        return _id;
    }

    public void setId(String id) {
        this._id = id;
    }
    
    
    
}
