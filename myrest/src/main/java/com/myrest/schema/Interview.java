/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myrest.schema;

import java.util.Date;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author emma.seyranyan
 */
@Document (collection = "interview")
public class Interview {
    //@Id String _id;
    private String date;
    private String result;
    private String resume;
    private String vacancy;

    public Interview( String date, String result, String resume, String vacancy) {
        //this._id = id;
        this.date = date;
        this.result = result;
        this.resume = resume;
        this.vacancy = vacancy;
    }

    public Interview() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getVacancy() {
        return vacancy;
    }

    public void setVacancy(String vacancy) {
        this.vacancy = vacancy;
    }

    
}
