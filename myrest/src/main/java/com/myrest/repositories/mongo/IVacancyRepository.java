/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myrest.repositories.mongo;

import com.myrest.schema.Vacancy;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author emma.seyranyan
 */
public interface IVacancyRepository extends MongoRepository<Vacancy, String> {

	List<Vacancy> findByTitle(@Param("title") String name);
        
        List<Vacancy> findById(@Param("id") String id);
        
        void deleteAll();

}
