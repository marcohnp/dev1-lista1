package com.example.dev1lista1.stub.response;

import com.example.dev1lista1.enums.CalculadoraEnum;
import com.example.dev1lista1.model.response.CalculadoraResponse;

public class CalculadoraResponseStub {

    public static CalculadoraResponse createCalculadoraResponseStub() {
        var stub = new CalculadoraResponse();
        stub.setNumero1(10.0);
        stub.setNumero2(5.0);
        stub.setOperacao(CalculadoraEnum.DIVISAO);
        stub.setResultado(2.0);
        return stub;
    }
}
