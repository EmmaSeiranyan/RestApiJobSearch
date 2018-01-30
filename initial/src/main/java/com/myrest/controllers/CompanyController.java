/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myrest.controllers;

import com.myrest.repositories.ICompanyRepository;
import com.myrest.schema.Company;
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
public class CompanyController {
    
    @Autowired
    private ICompanyRepository companyRepository;
    
    @RequestMapping(method=RequestMethod.GET, value="/companies")                             //SELECT *  -----------   GET
    public Iterable<Company> company() {
        return companyRepository.findAll();
    }
    
    @RequestMapping(method=RequestMethod.GET, value="/companies/{id}")                        //SELECT BY ID  ---------  GET
    public Company show(@PathVariable String id) {
        return companyRepository.findOne(id);
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/companies")                            //INSERT     ----------   POST
    public Company save(@RequestBody Company company) {
        companyRepository.save(company);
        return company;
    }
    
    @RequestMapping(method=RequestMethod.PUT, value="/companies/{id}")                        //UPDATE   ------------    PUT
    public Company update(@PathVariable String id, @RequestBody Company company) {
        Company comp = companyRepository.findOne(id);
        if(company.getTitle() != null)
            comp.setTitle(company.getTitle());
        if(company.getAddress()!= null)
            comp.setAddress(company.getAddress());
        companyRepository.save(comp);
        return comp;
    }
    
    @RequestMapping(method=RequestMethod.DELETE, value="/companies/{id}")                     //DELETE BY ID ----------   DELETE
    public String delete(@PathVariable String id) {
        Company company = companyRepository.findOne(id);
        companyRepository.delete(company);

        return "company deleted";
    }
    
}
