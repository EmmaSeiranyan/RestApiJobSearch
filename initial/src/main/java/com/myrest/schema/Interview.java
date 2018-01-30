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
    private int resume;
    private int vacancy;

    public Interview( String date, String result, int resume, int vacancy) {
        //this._id = id;
        this.date = date;
        this.result = result;
        this.resume = resume;
        this.vacancy = vacancy;
    }

    public Interview() {
    }
    

//    public String getId() {
//        return _id;
//    }
//
//    public void setId(String id) {
//        this._id = id;
//    }

   

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

    public int getResume() {
        return resume;
    }

    public void setResume(int resume) {
        this.resume = resume;
    }

    public int getVacancy() {
        return vacancy;
    }

    public void setVacancy(int vacancy) {
        this.vacancy = vacancy;
    }

    
}
