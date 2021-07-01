package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
class OrController
{
    @RequestMapping(method = RequestMethod.GET)
    ModelAndView
    index()
    {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("hoa_version", "HOA v0.1");
        return mav;
    }
}
