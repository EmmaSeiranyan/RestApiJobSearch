/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myrest.schema;

import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author emma.seyranyan
 */
@Entity
@Table(name = "resume" )
@Document (collection = "resume")
public class Resume {
    @javax.persistence.Id
    @GeneratedValue
    @Column(name = "code", nullable = false)
    @org.springframework.data.annotation.Id private String id;
    
    @Column(name = "title", nullable = false)
    private String title;
    
    @Column(name = "person", nullable = false)
    private People person;
    
    @Column(name = "tech", nullable = false)
    private Technology tech;
    
    @Column(name = "salary", nullable = false)
    private Float salary;
    
    private String city;
    
    @Column(name = "experience", nullable = false)
    private Integer experience;
    
    private ArrayList<Interview> interviews;

    public Resume(String id, String title, People person, Technology tech, float salary, String city, int experience, ArrayList<Interview> interviews) {
        this.id = id;
        this.title = title;
        this.person = person;
        this.tech = tech;
        this.salary = salary;
        //this.city = city;
        this.experience = experience;
        this.interviews = interviews;
    }

    public Resume() {
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

    public People getPerson() {
        return person;
    }

    public void setPerson(People person) {
        this.person = person;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
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
