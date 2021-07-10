package com.example.dev1lista1.enums;

import java.util.EnumSet;

public enum CalculadoraEnum {

    ADICAO(1,"Adição"),
    SUBTRACAO(2,"Subtração"),
    MULTIPLICAO(3, "Multiplicação"),
    DIVISAO(4, "Divisão"),
    OPERACAO_INVALIDA(5, "Operação Inválida");

    private final Integer cod;
    private final String descricao;

    CalculadoraEnum(Integer cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public Integer getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public static CalculadoraEnum fromValue(Integer value) {
        return EnumSet.allOf(CalculadoraEnum.class)
                .stream()
                .filter(calculadoraEnum -> calculadoraEnum.getCod().equals(value))
                .findFirst()
                .orElse(null);
    }
}
