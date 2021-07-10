package com.example.dev1lista1.facade;

import com.example.dev1lista1.enums.CalculadoraEnum;
import com.example.dev1lista1.enums.DiaSemanaEnum;
import com.example.dev1lista1.model.CalculadoraModel;
import com.example.dev1lista1.model.DiaSemanaModel;
import com.example.dev1lista1.service.CalculadoraService;
import com.example.dev1lista1.stub.CalculadoraModelStub;
import com.example.dev1lista1.stub.response.CalculadoraResponseStub;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CalculadoraFacadeTest {

    @Mock
    private CalculadoraService service;

    @InjectMocks
    private CalculadoraFacade facade;

    @Test
    void calcula_deve_retornar_calculadoraResponse_quando_uma_request_for_valida(){
        when(service.calcula(any(), any(), any())).thenReturn(CalculadoraModelStub.createCalculadoraModelStub());
        assertEquals(CalculadoraResponseStub.createCalculadoraResponseStub(), facade.calcula(any(), any(), any()));
        verify(service, times(1)).calcula(any(), any(), any());
    }

    @Test
    void calcula_deve_retornar_adicao_quando_model_operacao_for_1() {
        when(service.calcula(any(), any(), any())).thenReturn(new CalculadoraModel(10.0, 5.0, 1, 15.0));
        var response = facade.calcula("adicao", 10.0, 5.0);
        assertEquals(CalculadoraEnum.ADICAO, response.getOperacao());
    }

    @Test
    void calcula_deve_retornar_subtracao_quando_model_operacao_for_2() {
        when(service.calcula(any(), any(), any())).thenReturn(new CalculadoraModel(10.0, 5.0, 2, 5.0));
        var response = facade.calcula("subtracao", 10.0, 5.0);
        assertEquals(CalculadoraEnum.SUBTRACAO, response.getOperacao());
    }

    @Test
    void calcula_deve_retornar_multiplicacao_quando_model_operacao_for_3() {
        when(service.calcula(any(), any(), any())).thenReturn(new CalculadoraModel(10.0, 5.0, 3, 50.0));
        var response = facade.calcula("multiplicacao", 10.0, 5.0);
        assertEquals(CalculadoraEnum.MULTIPLICAO, response.getOperacao());
    }

    @Test
    void calcula_deve_retornar_divisao_quando_model_operacao_for_4() {
        when(service.calcula(any(), any(), any())).thenReturn(new CalculadoraModel(10.0, 5.0, 4, 2.0));
        var response = facade.calcula("divisao", 10.0, 5.0);
        assertEquals(CalculadoraEnum.DIVISAO, response.getOperacao());
    }

    @Test
    void calcula_deve_retornar_operacao_invalida_quando_model_operacao_for_5() {
        when(service.calcula(any(), any(), any())).thenReturn(new CalculadoraModel(10.0, 5.0, 5, null));
        var response = facade.calcula("operacaoinvalida", 10.0, 5.0);
        assertEquals(CalculadoraEnum.OPERACAO_INVALIDA, response.getOperacao());
    }

}