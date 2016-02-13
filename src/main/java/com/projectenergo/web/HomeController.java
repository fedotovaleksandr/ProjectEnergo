package com.projectenergo.web;

import com.projectenergo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by aleksandr on 11.02.2016.
 */
@Controller
public class HomeController {

    private PersonService personService;

    @Autowired
    public void setProductService(PersonService productService) {
        this.personService = productService;
    }


    @RequestMapping(value = "/", method=RequestMethod.GET, produces="text/plain")
    public String index(Model model) {

        model.addAttribute("name", "Big buddy");
        model.addAttribute("persons",personService.listAllPerson());
        return "index";
    }


}
