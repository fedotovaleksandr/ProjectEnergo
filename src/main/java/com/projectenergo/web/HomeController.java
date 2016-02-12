package com.projectenergo.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by aleksandr on 11.02.2016.
 */
@RestController
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(ModelAndView mv) {
        mv.addObject("name", "Big buddy");
        mv.setViewName("index");
        return mv;
    }


}
