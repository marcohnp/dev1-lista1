package com.example.dev1lista1.controller;

import com.example.dev1lista1.facade.ImcFacade;
import com.example.dev1lista1.model.response.ImcResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/imc")
public class ImcController {

    @Autowired
    private ImcFacade facade;

    @GetMapping(value = "/{peso}/{altura}")
    public ImcResponse getImc(@PathVariable Double peso, @PathVariable Double altura) {
        return facade.retornaImc(peso, altura);

    }
}
