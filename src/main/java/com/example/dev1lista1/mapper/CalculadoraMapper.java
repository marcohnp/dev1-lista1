package com.example.dev1lista1.mapper;

import com.example.dev1lista1.enums.CalculadoraEnum;
import com.example.dev1lista1.model.CalculadoraModel;
import com.example.dev1lista1.model.response.CalculadoraResponse;

public class CalculadoraMapper {

    public static CalculadoraResponse mapToResponse(CalculadoraModel model){
        var response = new CalculadoraResponse();
        response.setNumero1(model.getNumero1());
        response.setNumero2(model.getNumero2());
        response.setOperacao(CalculadoraEnum.fromValue(model.getOperacao()));
        response.setResultado(model.getResultado());
        return response;
    }
}
