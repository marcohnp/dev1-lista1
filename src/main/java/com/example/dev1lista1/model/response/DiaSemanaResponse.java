package com.example.dev1lista1.model.response;

import com.example.dev1lista1.enums.DiaSemanaEnum;

import java.util.Objects;

public class DiaSemanaResponse {

    private Integer ano;
    private Integer mes;
    private Integer dia;
    private DiaSemanaEnum descricao;

    public DiaSemanaResponse(){
    }

    public DiaSemanaResponse(Integer ano, Integer mes, Integer dia, DiaSemanaEnum descricao) {
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

    public DiaSemanaEnum getDescricao() {
        return descricao;
    }

    public void setDescricao(DiaSemanaEnum descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DiaSemanaResponse)) return false;
        DiaSemanaResponse that = (DiaSemanaResponse) o;
        return Objects.equals(ano, that.ano) && Objects.equals(mes, that.mes)
                && Objects.equals(dia, that.dia) && descricao == that.descricao;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ano, mes, dia, descricao);
    }
}
