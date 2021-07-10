package com.example.dev1lista1.controller;

import com.example.dev1lista1.facade.CalculadoraFacade;
import com.example.dev1lista1.model.response.CalculadoraResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/calculadora")
public class CalculadoraController {

    @Autowired
    private CalculadoraFacade calculadoraFacade;

    @GetMapping(value = "/{operacao}")
    public CalculadoraResponse calcula(@PathVariable String operacao, @RequestParam Double n1, @RequestParam Double n2){
        return calculadoraFacade.calcula(operacao, n1, n2);
    }
}
