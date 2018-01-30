/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myrest.controllers;

import com.myrest.repositories.IVacancyRepository;
import com.myrest.schema.Resume;
import com.myrest.schema.Vacancy;
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
public class VacancyController {
    
    @Autowired
    private IVacancyRepository vacancyRepository;
    
    @RequestMapping(method=RequestMethod.GET, value="/vacancies")                             //SELECT *  -----------   GET
    public Iterable<Vacancy> vacancy() {
        return vacancyRepository.findAll();
    }
    
    @RequestMapping(method=RequestMethod.GET, value="/vacancies/{id}")                        //SELECT BY ID  ---------  GET
    public Vacancy show(@PathVariable String id) {
        return vacancyRepository.findOne(id);
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/vacancies")                            //INSERT     ----------   POST
    public Vacancy save(@RequestBody Vacancy vacancy) {
        vacancyRepository.save(vacancy);
        return vacancy;
    }
    
    @RequestMapping(method=RequestMethod.PUT, value="/vacancies/{id}")                        //UPDATE   ------------    PUT
    public Vacancy update(@PathVariable String id, @RequestBody Vacancy vacancy) {
        Vacancy vac = vacancyRepository.findOne(id);
        if(vacancy.getTitle() != null)
            vac.setTitle(vacancy.getTitle());
        if(vacancy.getCity()!= null)
            vac.setCity(vacancy.getCity());
        if(vacancy.getComp()!= null)
            vac.setComp(vacancy.getComp());
        if(vacancy.getInterviews()!= null)
            vac.setInterviews(vacancy.getInterviews());
        if(vacancy.getExperience()!= null)
            vac.setExperience(vacancy.getExperience());
        if(vacancy.getSalary()!= null)
            vac.setSalary(vacancy.getSalary());
        if(vacancy.getTech()!= null)
            vac.setTech(vacancy.getTech());
        vacancyRepository.save(vac);
        return vac;
    }
    
    @RequestMapping(method=RequestMethod.DELETE, value="/vacancies/{id}")                     //DELETE BY ID ----------   DELETE
    public String delete(@PathVariable String id) {
        Vacancy vacancy = vacancyRepository.findOne(id);
        vacancyRepository.delete(vacancy);

        return "resume deleted";
    }
}
