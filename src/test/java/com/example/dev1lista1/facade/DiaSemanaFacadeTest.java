package com.example.dev1lista1.facade;

import com.example.dev1lista1.enums.DiaSemanaEnum;
import com.example.dev1lista1.model.DiaSemanaModel;
import com.example.dev1lista1.service.DiaSemanaService;
import com.example.dev1lista1.stub.DiaSemanaModelStub;
import com.example.dev1lista1.stub.response.DiaSemanaResponseStub;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class DiaSemanaFacadeTest {

    @Mock
    private DiaSemanaService service;

    @InjectMocks
    private DiaSemanaFacade facade;

    @Test
    void retornaDiaSemana_deve_retornar_diaSemanaResponse_quando_uma_request_for_valida() {
        when(service.retornaDiaSemana(any(), any(), any())).thenReturn(DiaSemanaModelStub.createDiaSemanaModelStub());
        assertEquals(DiaSemanaResponseStub.createDiaSemanaResponseStub(), facade.retornaDiaSemana(any(), any(), any()));
        verify(service, times(1)).retornaDiaSemana(any(), any(), any());
    }

    @Test
    void retornaDiseSemana_deve_retornar_domingo_quando_model_descricao_for_1() {
        when(service.retornaDiaSemana(any(), any(), any())).thenReturn(new DiaSemanaModel(2021, 7, 4, 1));
        var response = facade.retornaDiaSemana(2021, 7, 4);
        assertEquals(DiaSemanaEnum.DOMINGO, response.getDescricao());
    }

    @Test
    void retornaDiseSemana_deve_retornar_segunda_quando_model_descricao_for_2() {
        when(service.retornaDiaSemana(any(), any(), any())).thenReturn(new DiaSemanaModel(2021, 7, 5, 2));
        var response = facade.retornaDiaSemana(2021, 7, 5);
        assertEquals(DiaSemanaEnum.SEGUNDA_FEIRA, response.getDescricao());
    }

    @Test
    void retornaDiseSemana_deve_retornar_terca_quando_model_descricao_for_3() {
        when(service.retornaDiaSemana(any(), any(), any())).thenReturn(new DiaSemanaModel(2021, 7, 6, 3));
        var response = facade.retornaDiaSemana(2021, 7, 6);
        assertEquals(DiaSemanaEnum.TERCA_FEIRA, response.getDescricao());
    }

    @Test
    void retornaDiseSemana_deve_retornar_quarta_quando_model_descricao_for_4() {
        when(service.retornaDiaSemana(any(), any(), any())).thenReturn(new DiaSemanaModel(2021, 7, 7, 4));
        var response = facade.retornaDiaSemana(2021, 7, 7);
        assertEquals(DiaSemanaEnum.QUARTA_FEIRA, response.getDescricao());
    }

    @Test
    void retornaDiseSemana_deve_retornar_quinta_quando_model_descricao_for_5() {
        when(service.retornaDiaSemana(any(), any(), any())).thenReturn(new DiaSemanaModel(2021, 7, 8, 5));
        var response = facade.retornaDiaSemana(2021, 7, 8);
        assertEquals(DiaSemanaEnum.QUINTA_FEIRA, response.getDescricao());
    }

    @Test
    void retornaDiseSemana_deve_retornar_sexta_quando_model_descricao_for_6() {
        when(service.retornaDiaSemana(any(), any(), any())).thenReturn(new DiaSemanaModel(2021, 7, 9, 6));
        var response = facade.retornaDiaSemana(2021, 7, 9);
        assertEquals(DiaSemanaEnum.SEXTA_FEIRA, response.getDescricao());
    }

    @Test
    void retornaDiseSemana_deve_retornar_sabado_quando_model_descricao_for_7() {
        when(service.retornaDiaSemana(any(), any(), any())).thenReturn(new DiaSemanaModel(2021, 7, 10, 7));
        var response = facade.retornaDiaSemana(2021, 7, 10);
        assertEquals(DiaSemanaEnum.SABADO, response.getDescricao());
    }


}