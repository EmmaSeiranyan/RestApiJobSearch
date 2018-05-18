package com.myrest.controllers.mongo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pavel
 */
import com.myrest.repositories.mongo.IMerchRepository;
import com.myrest.schema.Merch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MerchController {
    
    @Autowired
    private IMerchRepository merchRepository;

        @RequestMapping(method=RequestMethod.GET, value="/merch") //INSERT —------— POST
        public Iterable<Merch>merch(){
        return merchRepository.findAll();
        }
    }

