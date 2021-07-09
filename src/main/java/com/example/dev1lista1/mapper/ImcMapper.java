package com.example.dev1lista1.mapper;

import com.example.dev1lista1.model.ImcModel;
import com.example.dev1lista1.model.response.ImcResponse;
import org.springframework.util.ObjectUtils;

public class ImcMapper {

    public static ImcResponse mapToResponse(ImcModel model) {
        if (ObjectUtils.isEmpty(model)) return null;
        ImcResponse response = new ImcResponse();
        response.setPeso(model.getPeso());
        response.setAltura(model.getAltura());
        response.setImc(model.getImc());
        response.setClassificacao(model.getClassificacao());
        return response;
    }
}
