package com.example.dev1lista1.stub;

import com.example.dev1lista1.model.DiaSemanaModel;

public class DiaSemanaModelStub {

    public static DiaSemanaModel createDiaSemanaModelStub() {
        var stub = new DiaSemanaModel();
        stub.setAno(2021);
        stub.setMes(7);
        stub.setDia(10);
        stub.setDescricao(7);
        return stub;
    }
}
