/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myrest.schema;

import com.myrest.entities.DomainObject;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
/**
 *
 * @author emma.seyranyan
 */	
@Document(collection = "company")
public class Company implements DomainObject{
    @Id private org.bson.types.ObjectId id;
    private String title;
    private String address;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}

