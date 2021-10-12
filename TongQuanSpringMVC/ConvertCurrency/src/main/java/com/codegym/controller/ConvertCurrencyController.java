package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ConvertCurrencyController {
    @GetMapping("convert")
    public ModelAndView getForm() {
        return new ModelAndView("showForm");
    }

    @PostMapping("result")
    public ModelAndView currency(HttpServletRequest request){
        int usd = Integer.parseInt(request.getParameter("number"));
        int rate = Integer.parseInt(request.getParameter("rate"));
        ModelAndView modelAndView = new ModelAndView("success");
        int result = usd * rate;
        modelAndView.addObject("result", result);
        return modelAndView;

    }
}
