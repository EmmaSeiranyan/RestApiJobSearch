/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myrest.controllers.pg;

import com.myrest.exceptions.RestException;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Эмма
 */
@Controller
public class ExceptionHandlerController {

    private static final Logger LOG = Logger.getLogger(ExceptionHandlerController.class);

    @ExceptionHandler(RestException.class)
    public @ResponseBody
    String handleException(RestException e) {
        LOG.error("Ошибка: " + e.getMessage(), e);
        return "Ошибка: " + e.getMessage();
    }
}