package com.example.dev1lista1.facade;

import com.example.dev1lista1.mapper.ImcMapper;
import com.example.dev1lista1.model.response.ImcResponse;
import com.example.dev1lista1.service.ImcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ImcFacade {

    @Autowired
    private ImcService imcService;

    public ImcResponse retornaImc(Double peso, Double altura) {
        return ImcMapper.mapToResponse(imcService.retornaImc(peso, altura));
    }
}
