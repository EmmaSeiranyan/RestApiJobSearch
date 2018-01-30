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
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "Specialization")
public class Specialization {
    @Id private String _id;
    private String title;

    

    public Specialization(String id, String title) {
        this._id = id;
        this.title = title;
    }

    public Specialization() {
    }

    
    public String getId() {
        return _id;
    }

    public void setId(String id) {
        this._id = id;
    }

    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    
}
