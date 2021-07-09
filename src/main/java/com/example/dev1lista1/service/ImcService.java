package com.example.dev1lista1.service;

import com.example.dev1lista1.model.ImcModel;
import org.springframework.stereotype.Service;

@Service
public class ImcService {

    public ImcModel retornaImc(Double peso, Double altura) {
        var model = new ImcModel(peso, altura, null, null);
        model.setImc(calculaImc(peso, altura));
        model.setClassificacao(setClassificacao(model.getImc()));
        return model;
    }

    private Double calculaImc(Double peso, Double altura) {
        return peso / (altura * altura);
    }

    private String setClassificacao(Double imc) {
        var classificacao = "";
        if (imc < 18.5) {
            classificacao = "Magreza";
        } else if (imc > 18.5 && imc < 24.9) {
            classificacao = "Saudável";
        } else if (imc > 25.0 && imc < 29.9) {
            classificacao = "Sobrepeso";
        } else if (imc > 30.0 && imc < 34.9) {
            classificacao = "Obesidade Grau I";
        } else if (imc > 35.0 && imc < 39.9) {
            classificacao = "Obesidade Grau II (severa)";
        } else if (imc >= 40.0) {
            classificacao = "Obesidade Grau III (mórbida)";
        }
        return classificacao;
    }
}
