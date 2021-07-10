package com.example.dev1lista1.controller;

import com.example.dev1lista1.facade.DiaSemanaFacade;
import com.example.dev1lista1.model.response.DiaSemanaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/diasemana")
public class DiaSemanaController {

    @Autowired
    private DiaSemanaFacade diaSemanaFacade;

    @GetMapping(value = "/{ano}/{mes}/{dia}")
    public DiaSemanaResponse retornaDiaSemana(@PathVariable Integer ano,
                                              @PathVariable Integer mes,
                                              @PathVariable Integer dia) {
        return diaSemanaFacade.retornaDiaSemana(ano, mes, dia);
    }

}
