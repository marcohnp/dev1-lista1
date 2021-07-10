package com.example.dev1lista1.model.response;

import com.example.dev1lista1.enums.CalculadoraEnum;

import java.util.Objects;

public class CalculadoraResponse {

    private Double numero1;
    private Double numero2;
    private CalculadoraEnum operacao;
    private Double resultado;

    public  CalculadoraResponse(){}

    public CalculadoraResponse(Double numero1, Double numero2, CalculadoraEnum operacao, Double resultado) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operacao = operacao;
        this.resultado = resultado;
    }

    public Double getNumero1() {
        return numero1;
    }

    public void setNumero1(Double numero1) {
        this.numero1 = numero1;
    }

    public Double getNumero2() {
        return numero2;
    }

    public void setNumero2(Double numero2) {
        this.numero2 = numero2;
    }

    public CalculadoraEnum getOperacao() {
        return operacao;
    }

    public void setOperacao(CalculadoraEnum operacao) {
        this.operacao = operacao;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CalculadoraResponse)) return false;
        CalculadoraResponse that = (CalculadoraResponse) o;
        return Objects.equals(numero1, that.numero1) && Objects.equals(numero2, that.numero2) && operacao == that.operacao && Objects.equals(resultado, that.resultado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero1, numero2, operacao, resultado);
    }
}
