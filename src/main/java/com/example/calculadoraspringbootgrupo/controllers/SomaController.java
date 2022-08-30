package com.example.calculadoraspringbootgrupo.controllers;

import com.example.calculadoraspringbootgrupo.model.OperationModel;
import org.apache.coyote.http11.filters.SavedRequestInputFilter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SomaController {
    @GetMapping("/somar")
    public String getIndex(){
        return "calculadora.html";
    }

    @GetMapping("/resultado")

    public String calcula(Model model, @RequestParam(name = "a") int a, @RequestParam(name = "b") int b) {
        int c=a+b;
        model.addAttribute("a",a);
        model.addAttribute("b",b);
        model.addAttribute("c",c);
        return "resultado.html";
    }

    //controlador para o botao voltar, será necessário?
    @GetMapping("/voltar")
    public String voltar(){
        return "redirect:/somar";
    }



}
