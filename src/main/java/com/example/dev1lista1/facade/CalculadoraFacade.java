package com.example.dev1lista1.facade;

import com.example.dev1lista1.mapper.CalculadoraMapper;
import com.example.dev1lista1.model.response.CalculadoraResponse;
import com.example.dev1lista1.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculadoraFacade {

    @Autowired
    private CalculadoraService calculadoraService;
    public CalculadoraResponse calcula(String operacao, Double n1, Double n2) {
        return CalculadoraMapper.mapToResponse(calculadoraService.calcula(operacao, n1, n2));
    }
}
