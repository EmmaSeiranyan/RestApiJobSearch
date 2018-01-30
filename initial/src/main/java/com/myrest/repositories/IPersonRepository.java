/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myrest.repositories;

import com.myrest.schema.Person;
import java.util.List;
import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author emma.seyranyan
 */
//@RepositoryRestResource(collectionResourceRel = "person", path = "person")
public interface IPersonRepository extends MongoRepository<Person, String> {
    
    List<Person> findByName(@Param("name") String name);

    @Override
    public void delete(Person t);

    @Override
    public Person findOne(String id);

    @Override
    public <S extends Person> S insert(S s);

    
   
    

}
