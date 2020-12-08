package com.lamba.controller;


import com.lamba.model.Employee;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.lamba.service.CRUDService;
import org.springframework.web.servlet.view.RedirectView;

import java.util.*;

@Controller
public class CRUDController {

   @Autowired
   CRUDService service;


    @GetMapping("/")
    String getLandingPage(@ModelAttribute("e") Employee e){

        return "LandingPage";
    }

    @PostMapping("/create")
    RedirectView create(@ModelAttribute("e") Employee e){

        service.create(e);
        return new RedirectView("/");
    }

    @PostMapping("/update")
    RedirectView update(@ModelAttribute("e") Employee e){

        service.update(e);
        return new RedirectView("/");
    }

    @PostMapping("/read")
    ModelAndView read(@ModelAttribute("e") Employee e){

       Employee employee = service.read(e.getId());

        return new ModelAndView("employee","e",employee) ;
    }
    @PostMapping("/delete")
    RedirectView delete(@ModelAttribute("e") Employee e){

        service.delete(e.getId());
        return new RedirectView("/");
    }








}
