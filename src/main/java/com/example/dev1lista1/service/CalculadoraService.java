package com.example.dev1lista1.service;

import com.example.dev1lista1.model.CalculadoraModel;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class CalculadoraService {


    public CalculadoraModel calcula(String operacao, Double n1, Double n2) {
        var calculadora = new CalculadoraModel(n1, n2, null, null);
        calculadora.setOperacao(setTipoOperacao(operacao));
        calculadora.setResultado(executaCalculadora(calculadora.getOperacao(), n1, n2));
        return calculadora;
    }

    private Integer setTipoOperacao(String operacao) {
        switch (operacao.toLowerCase(Locale.ROOT)) {
            case "adicao":
                return 1;
            case "subtracao":
                return 2;
            case "multiplicacao":
                return 3;
            case "divisao":
                return 4;
            default:
                return 5;
        }
    }

    private Double executaCalculadora(Integer operacao, Double n1, Double n2) {
        switch (operacao) {
            case 1:
                return soma(n1, n2);
            case 2:
                return subtrai(n1, n2);
            case 3:
                return multiplica(n1, n2);
            case 4:
                return divide(n1, n2);
            default:
                return null;
        }
    }

    private Double soma(Double n1, Double n2) {
        return n1 + n2;
    }

    private Double subtrai(Double n1, Double n2) {
        return n1 - n2;
    }

    private Double multiplica(Double n1, Double n2) {
        return n1 * n2;
    }

    private Double divide(Double n1, Double n2) {
        return n1 / n2;
    }
}
