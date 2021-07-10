package com.example.dev1lista1.enums;

import java.util.EnumSet;

public enum DiaSemanaEnum {

    DOMINGO(1, "Domingo"),
    SEGUNDA_FEIRA(2, "Segunda-Feira"),
    TERCA_FEIRA(3, "Terça-Feira"),
    QUARTA_FEIRA(4, "Quarta-Feira"),
    QUINTA_FEIRA(5, "Quinta-Feira"),
    SEXTA_FEIRA(6, "Sexta-Feira"),
    SABADO(7, "Sábado");

    private final Integer cod;
    private final String descricao;

    DiaSemanaEnum(Integer cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public Integer getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public static DiaSemanaEnum fromValue(Integer value) {
        return EnumSet.allOf(DiaSemanaEnum.class)
                .stream()
                .filter(diaSemanaEnum -> diaSemanaEnum.getCod().equals(value))
                .findFirst()
                .orElse(null);
    }
}
