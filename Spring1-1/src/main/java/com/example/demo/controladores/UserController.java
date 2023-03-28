package com.example.demo.controladores;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @RequestMapping("/index")
    public ModelAndView index() {
    	ModelAndView mav = new ModelAndView("index");
        return mav;
    }
}
