package com.example.dev1lista1.model;

import java.util.Objects;

public class CalculadoraModel {

    private Double numero1;
    private Double numero2;
    private Integer operacao;
    private Double resultado;

    public CalculadoraModel(){}

    public CalculadoraModel(Double numero1, Double numero2, Integer operacao, Double resultado) {
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

    public Integer getOperacao() {
        return operacao;
    }

    public void setOperacao(Integer operacao) {
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
        if (!(o instanceof CalculadoraModel)) return false;
        CalculadoraModel that = (CalculadoraModel) o;
        return Objects.equals(numero1, that.numero1) && Objects.equals(numero2, that.numero2) && Objects.equals(operacao, that.operacao) && Objects.equals(resultado, that.resultado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero1, numero2, operacao, resultado);
    }
}
