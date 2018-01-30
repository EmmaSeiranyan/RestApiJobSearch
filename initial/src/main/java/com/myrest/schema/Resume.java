/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myrest.schema;

import java.util.ArrayList;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author emma.seyranyan
 */
@Document (collection = "resume")
public class Resume {
    @Id private String _id;
    private String title;
    private Person person;
    private Technology tech;
    private Float salary;
    private String city;
    private Integer experience;
    private ArrayList<Interview> interviews;

    public Resume(String id, String title, Person person, Technology tech, float salary, String city, int experience, ArrayList<Interview> interviews) {
        this._id = id;
        this.title = title;
        this.person = person;
        this.tech = tech;
        this.salary = salary;
        this.city = city;
        this.experience = experience;
        this.interviews = interviews;
    }

    public Resume() {
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
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

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
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
