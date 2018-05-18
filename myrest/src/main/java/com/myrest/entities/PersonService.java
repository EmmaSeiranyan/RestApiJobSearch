/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myrest.entities;

import com.myrest.schema.Person;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;
import com.myrest.entities.IPersonRepository;

/**
 *
 * @author Эмма
 */
@Service
public class PersonService implements IPersonService {
    @Autowired
    private IPersonRepository personRepository;

    @Override
    public <S extends Person> S save(S s) {
        try {
            personRepository.save(s);
        } catch (Exception e) {
            return null;
        }
        return s;
    }

    @Override
    public Iterable<Person> findAll() {
        List<Person> persons = (List<Person>) personRepository.findAll();
        
        return persons;
    }

}
