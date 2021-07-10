package com.example.dev1lista1.mapper;

import com.example.dev1lista1.enums.DiaSemanaEnum;
import com.example.dev1lista1.model.DiaSemanaModel;
import com.example.dev1lista1.model.response.DiaSemanaResponse;
import org.springframework.util.ObjectUtils;

public class DiaSemanaMapper {

    public static DiaSemanaResponse mapToResponse(DiaSemanaModel model) {
        if (ObjectUtils.isEmpty(model)) return null;
        var response = new DiaSemanaResponse();
        response.setAno(model.getAno());
        response.setMes(model.getMes());
        response.setDia(model.getDia());
        response.setDescricao(DiaSemanaEnum.fromValue(model.getDescricao()));
        return response;
    }
}
