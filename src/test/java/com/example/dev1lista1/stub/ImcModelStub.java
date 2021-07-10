package com.example.dev1lista1.stub;

import com.example.dev1lista1.model.ImcModel;

public class ImcModelStub {

    public static ImcModel createImcModelStub(){
        var stub = new ImcModel();
        stub.setPeso(80.0);
        stub.setAltura(1.75);
        stub.setImc(26.12244);
        stub.setClassificacao("Sobrepeso");
        return stub;
    }
}
