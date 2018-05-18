/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myrest.controllers.pg;

import com.myrest.exceptions.RestException;
import com.myrest.schema.Company;
import com.myrest.schema.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.myrest.entities.IPersonService;
import java.util.Iterator;

/**
 *
 * @author Эмма
 */
@Controller
public class PersonController extends ExceptionHandlerController {

    //private static final Logger LOG = Logger.getLogger(PersonController.class);

    @Autowired
    private IPersonService personService;

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public Person save(@RequestBody Person person) throws RestException {
        try {
            personService.save(person);
        } catch (Exception e) {
            throw new RestException(e);
        }
        return person;
    }
    
    @RequestMapping("/showPersons")
    public Iterable<Person> findCities() {
        
        Iterable<Person> persons = (Iterable<Person>) personService.findAll();
        
        return persons;
    }

}