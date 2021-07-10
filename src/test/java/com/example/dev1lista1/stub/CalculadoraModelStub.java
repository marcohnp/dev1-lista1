package com.example.dev1lista1.stub;

import com.example.dev1lista1.model.CalculadoraModel;

public class CalculadoraModelStub {

    public static CalculadoraModel createCalculadoraModelStub() {
        var stub = new CalculadoraModel();
        stub.setNumero1(10.0);
        stub.setNumero2(5.0);
        stub.setOperacao(4);
        stub.setResultado(2.0);
        return stub;
    }
}
