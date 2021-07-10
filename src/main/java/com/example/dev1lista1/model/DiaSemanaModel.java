package com.example.dev1lista1.model;

import java.util.Objects;

public class DiaSemanaModel {

    private Integer ano;
    private Integer mes;
    private Integer dia;
    private Integer descricao;

    public DiaSemanaModel(){}

    public DiaSemanaModel(Integer ano, Integer mes, Integer dia, Integer descricao) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.descricao = descricao;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getDescricao() {
        return descricao;
    }

    public void setDescricao(Integer descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DiaSemanaModel)) return false;
        DiaSemanaModel that = (DiaSemanaModel) o;
        return Objects.equals(ano, that.ano) && Objects.equals(mes, that.mes)
                && Objects.equals(dia, that.dia) && Objects.equals(descricao, that.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ano, mes, dia, descricao);
    }
}
