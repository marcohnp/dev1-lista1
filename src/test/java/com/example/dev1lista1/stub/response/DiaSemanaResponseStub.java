package com.example.dev1lista1.stub.response;

import com.example.dev1lista1.enums.DiaSemanaEnum;
import com.example.dev1lista1.model.response.DiaSemanaResponse;

public class DiaSemanaResponseStub {

    public static DiaSemanaResponse createDiaSemanaResponseStub(){
        var stub = new DiaSemanaResponse();
        stub.setAno(2021);
        stub.setMes(7);
        stub.setDia(10);
        stub.setDescricao(DiaSemanaEnum.SABADO);
        return stub;
    }
}
