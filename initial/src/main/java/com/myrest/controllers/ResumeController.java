/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myrest.controllers;

import com.myrest.repositories.IResumeRepository;
import com.myrest.schema.Person;
import com.myrest.schema.Resume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author emma.seyranyan
 */
@RestController
public class ResumeController {
 
    
    @Autowired
    private IResumeRepository resumeRepository;
    
    @RequestMapping(method=RequestMethod.GET, value="/resumes")                             //SELECT *  -----------   GET
    public Iterable<Resume> resume() {
        return resumeRepository.findAll();
    }
    
    @RequestMapping(method=RequestMethod.GET, value="/resumes/{id}")                        //SELECT BY ID  ---------  GET
    public Resume show(@PathVariable String id) {
        return resumeRepository.findOne(id);
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/resumes")                            //INSERT     ----------   POST
    public Resume save(@RequestBody Resume resume) {
        resumeRepository.save(resume);
        return resume;
    }
    
    @RequestMapping(method=RequestMethod.PUT, value="/resumes/{id}")                        //UPDATE   ------------    PUT
    public Resume update(@PathVariable String id, @RequestBody Resume resume) {
        Resume res = resumeRepository.findOne(id);
        if(resume.getTitle() != null)
            res.setTitle(resume.getTitle());
        if(resume.getCity()!= null)
            res.setCity(resume.getCity());
        if(resume.getExperience()!= null)
            res.setExperience(resume.getExperience());
        if(resume.getInterviews()!= null)
            res.setInterviews(resume.getInterviews());
        if(resume.getPerson()!= null)
            res.setPerson(resume.getPerson());
        if(resume.getSalary()!= null)
            res.setSalary(resume.getSalary());
        if(resume.getTech()!= null)
            res.setTech(resume.getTech());
        resumeRepository.save(res);
        return res;
    }
    
    @RequestMapping(method=RequestMethod.DELETE, value="/resumes/{id}")                     //DELETE BY ID ----------   DELETE
    public String delete(@PathVariable String id) {
        Resume resume = resumeRepository.findOne(id);
        resumeRepository.delete(resume);

        return "resume deleted";
    }
}
