/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myrest.entities;

import com.myrest.schema.Person;

/**
 *
 * @author Эмма
 */
public interface IPersonService {

    public <S extends Person> S save(S s);
    
    public Iterable<Person> findAll();

}