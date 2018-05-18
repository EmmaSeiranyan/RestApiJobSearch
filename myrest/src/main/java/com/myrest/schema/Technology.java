/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myrest.schema;

import java.util.ArrayList;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author emma.seyranyan
 */
@Document(collection = "tech")
public class Technology {
    @Id private String _id;
    private String title;
    private ArrayList<Specialization> spec;

    public Technology(String _id, String title, ArrayList<Specialization> spec) {
        this._id = _id;
        this.title = title;
        this.spec = spec;
    }

    public Technology() {
    }
    
    public String getId() {
        return _id;
    }

    public void setId(String id) {
        this._id = id;
    }

    public ArrayList<Specialization> getSpec() {
        return spec;
    }

    public void setSpec(ArrayList<Specialization> spec) {
        this.spec = spec;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    
    
}
