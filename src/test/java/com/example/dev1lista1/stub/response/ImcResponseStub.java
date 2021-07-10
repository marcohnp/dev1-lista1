package com.example.dev1lista1.stub.response;

import com.example.dev1lista1.model.response.ImcResponse;

public class ImcResponseStub {

    public static ImcResponse createImcResponseStub() {
        var stub = new ImcResponse();
        stub.setPeso(80.0);
        stub.setAltura(1.75);
        stub.setImc(26.12244);
        stub.setClassificacao("Sobrepeso");
        return stub;
    }
}
