/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myrest.controllers.mongo;

import com.myrest.repositories.mongo.IResumeRepository;
import com.myrest.repositories.mongo.IVacancyRepository;
import com.myrest.schema.Interview;
import com.myrest.schema.Person;
import com.myrest.schema.Resume;
import com.myrest.schema.Vacancy;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author emma.seyranyan
 */
@Controller
public class ResumeController {

    @Autowired
    private IResumeRepository resumeRepository;

//    @Autowired
//    private IVacancyRepository vacancyRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/resumes")                             //SELECT *  -----------   GET
    public Iterable<Resume> resume() {
        return resumeRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/resumes/{id}")                        //SELECT BY ID  ---------  GET
    public Resume show(@PathVariable String id) {
        return resumeRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/resumes")                            //INSERT     ----------   POST
    public @ResponseBody Resume save(@RequestBody Resume resume) throws Exception {
        resumeRepository.deleteAll();
       
        return null;
//        List<Interview> intList = resume.getInterviews();
//        List<Interview> interviews = new ArrayList<>();
//        List<Vacancy> vacList = vacancyRepository.findAll();
//        for (Interview interview : intList) {
//            for (Vacancy vacancy : vacList) {
//                if (interview.getVacancy().equals(vacancy.getId())) {
//                    interviews.add(interview);
//                }
//            }
//        }
//        if (interviews.isEmpty()) {
//            //throw new Exception("Вакансия не найдена");
//            return null;
//
//        }
        //resume.setInterviews(interviews);
        //resumeRepository.save(resume);
       //return resume;
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/resumes/{id}")                        //UPDATE   ------------    PUT
    public Resume update(@PathVariable String id, @RequestBody Resume resume) {
        Resume res = resumeRepository.findOne(id);
        if (resume.getTitle() != null) {
            res.setTitle(resume.getTitle());
        }
        if (resume.getExperience() != null) {
            res.setExperience(resume.getExperience());
        }
        if (resume.getInterviews() != null) {
            res.setInterviews(resume.getInterviews());
        }
        if (resume.getPerson() != null) {
            res.setPerson(resume.getPerson());
        }
        if (resume.getSalary() != null) {
            res.setSalary(resume.getSalary());
        }
        if (resume.getTech() != null) {
            res.setTech(resume.getTech());
        }
        resumeRepository.save(res);
        return res;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/resumes/{id}")                     //DELETE BY ID ----------   DELETE
    public String delete(@PathVariable String id) {
        Resume resume = resumeRepository.findOne(id);
        resumeRepository.delete(resume);

        return "resume deleted";
    }
}
