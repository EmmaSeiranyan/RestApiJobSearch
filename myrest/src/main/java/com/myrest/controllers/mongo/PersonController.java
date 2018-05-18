/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myrest.controllers.mongo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.myrest.schema.Person;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.myrest.repositories.mongo.IPersonRepository;
import com.myrest.repositories.mongo.IResumeRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.RequestBody;
 

 
@RestController
public class PersonController {
 
    @Autowired
    private IPersonRepository personRepository;
    
   
    @RequestMapping("/")
    public String welcome() {//Welcome page, non-rest
        return "Welcome to RestTemplate Example.";
    }
    
    @RequestMapping(method=RequestMethod.GET, value="/persons")                             //SELECT *
    public Iterable<Person> person() {
        return personRepository.findAll();
    }
 
    @RequestMapping(method=RequestMethod.POST, value="/persons")                            //INSERT
    public Person save(@RequestBody Person person) {
        personRepository.save(person);
        return person;
    }
    
    
    @RequestMapping(method=RequestMethod.GET, value="/persons/{id}")                        //SELECT BY ID
    public Person show(@PathVariable String id) {
        return personRepository.findOne(id);
    }
    
    @RequestMapping(method=RequestMethod.PUT, value="/persons/{id}")                        //UPDATE
    public Person update(@PathVariable String id, @RequestBody Person person) {
        Person pers = personRepository.findOne(id);
        if(person.getName() != null)
            pers.setName(person.getName());
        if(person.getMail()!= null)
            pers.setMail(person.getMail());
        if(person.getCity()!= null)
            pers.setCity(person.getCity());
        if(person.getPhone()!= null)
            pers.setPhone(person.getPhone());
        personRepository.save(pers);
        return pers;
    }
    
    @RequestMapping(method=RequestMethod.DELETE, value="/persons/{id}")                     //DELETE BY ID  ----------------------------  PERSON
    public String delete(@PathVariable String id) {
        Person person = personRepository.findOne(id);
        personRepository.delete(person);

        return "person deleted";
    }
    
   
}