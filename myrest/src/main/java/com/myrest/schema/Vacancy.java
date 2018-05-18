/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myrest.schema;

import com.myrest.schema.Company;
import java.util.ArrayList;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author emma.seyranyan
 */
@Document (collection = "vacancy")
public class Vacancy {
    @Id private String _id;
    private String title;
    private Technology tech;
    private Company comp;
    private int experience;
    private float salary;
    private String city;
    private ArrayList<Interview> interviews;

    public Vacancy(String id, String title, Technology tech, Company comp, int experience, float salary, String city, ArrayList<Interview> interviews) {
        this._id = id;
        this.title = title;
        this.tech = tech;
        this.comp = comp;
        this.experience = experience;
        this.salary = salary;
        this.city = city;
        this.interviews = interviews;
    }

    public Vacancy() {
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

    public Company getComp() {
        return comp;
    }

    public void setComp(Company comp) {
        this.comp = comp;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public Technology getTech() {
        return tech;
    }

    public void setTech(Technology tech) {
        this.tech = tech;
    }

    public ArrayList<Interview> getInterviews() {
        return interviews;
    }

    public void setInterviews(ArrayList<Interview> interviews) {
        this.interviews = interviews;
    }
    

}
