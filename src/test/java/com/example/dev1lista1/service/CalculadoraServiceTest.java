package com.example.dev1lista1.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CalculadoraServiceTest {

    @InjectMocks
    private CalculadoraService service;

    @Test
    void calcula_deve_somar_quando_operacao_for_adicao() {
        var model = service.calcula("adicao", 10.0, 5.0);
        assertEquals(15.0, model.getResultado());
        assertEquals(1, model.getOperacao());
    }

    @Test
    void calcula_deve_subtrair_quando_operacao_for_subtracao() {
        var model = service.calcula("subtracao", 10.0, 5.0);
        assertEquals(5.0, model.getResultado());
        assertEquals(2, model.getOperacao());
    }

    @Test
    void calcula_deve_multiplicar_quando_operacao_for_multiplicacao() {
        var model = service.calcula("multiplicacao", 10.0, 5.0);
        assertEquals(50.0, model.getResultado());
        assertEquals(3, model.getOperacao());
    }

    @Test
    void calcula_deve_dividir_quando_operacao_for_divisao() {
        var model = service.calcula("divisao", 10.0, 5.0);
        assertEquals(2.0, model.getResultado());
        assertEquals(4, model.getOperacao());
    }

    @Test
    void calcula_deve_retornar_null_quando_operacao_for_invalida() {
        var model = service.calcula("invalida", 10.0, 5.0);
        assertNull(model.getResultado());
        assertEquals(5, model.getOperacao());
    }

}