package org.example.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping(value = "/inicio", method = RequestMethod.GET)
    public ModelAndView mostrarInicio() {
        return new ModelAndView("inicio");
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView mostrarLogin(){
        return new ModelAndView("login");
    }

    @RequestMapping(value = "/accesoDenegado")
    public ModelAndView errorAcceso(){
        return new ModelAndView("denegado", HttpStatus.FORBIDDEN);
    }

    @RequestMapping(value = "/error")
    public ModelAndView errorLogin(){
        return new ModelAndView("login");
    }

    @RequestMapping(value = "/logout")
    public ModelAndView logout(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if(authentication != null) {
            SecurityContextHolder.getContext().setAuthentication(null);
        }
        return new ModelAndView("redirect:/login?logout");
    }

}
