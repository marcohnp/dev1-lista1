package com.example.dev1lista1.facade;

import com.example.dev1lista1.mapper.DiaSemanaMapper;
import com.example.dev1lista1.model.response.DiaSemanaResponse;
import com.example.dev1lista1.service.DiaSemanaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DiaSemanaFacade {

    @Autowired
    private DiaSemanaService diaSemanaService;

    public DiaSemanaResponse retornaDiaSemana(Integer ano, Integer mes, Integer dia){
        return DiaSemanaMapper.mapToResponse(diaSemanaService.retornaDiaSemana(ano, mes, dia));
    }
}
