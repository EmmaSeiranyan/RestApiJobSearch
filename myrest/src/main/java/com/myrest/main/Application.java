
package com.myrest.main;


import com.myrest.conf.JpaConfig;
import com.myrest.repositories.mongo.IPersonRepository;
import com.myrest.repositories.mongo.IResumeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;


@SpringBootApplication
//@EnableMongoRepositories(basePackageClasses = IResumeRepository.class)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
