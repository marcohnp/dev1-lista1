package com.example.dev1lista1.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
class ImcServiceTest {

    @InjectMocks
    private ImcService service;

    @Test
    void retornaImc_deve_retornar_classificacao_magreza_quando_imc_for_menor_que_18_5() {
        var actual = service.retornaImc(50.0, 1.75);
        assertEquals("Magreza", actual.getClassificacao());
        assertTrue(actual.getImc() < 18.5);
    }

    @Test
    void retornaImc_deve_retornar_classificacao_saudavel_quando_imc_for_maior_que_18_5_menor_24_9() {
        var actual = service.retornaImc(60.0, 1.75);
        assertEquals("Saudável", actual.getClassificacao());
        assertTrue(actual.getImc() > 18.5 && actual.getImc() < 24.9);
    }

    @Test
    void retornaImc_deve_retornar_classificacao_sobrepeso_quando_imc_for_maior_que_25_menor_29_9() {
        var actual = service.retornaImc(80.0, 1.75);
        assertEquals("Sobrepeso", actual.getClassificacao());
        assertTrue(actual.getImc() > 25.0 && actual.getImc() < 29.9);
    }

    @Test
    void retornaImc_deve_retornar_classificacao_obesidade_I_quando_imc_for_maior_que_30_menor_34_9() {
        var actual = service.retornaImc(95.0, 1.75);
        assertEquals("Obesidade Grau I", actual.getClassificacao());
        assertTrue(actual.getImc() > 30.0 && actual.getImc() < 34.9);
    }

    @Test
    void retornaImc_deve_retornar_classificacao_obesidade_II_quando_imc_for_maior_que_35_menor_39_9() {
        var actual = service.retornaImc(110.0, 1.75);
        assertEquals("Obesidade Grau II (severa)", actual.getClassificacao());
        assertTrue(actual.getImc() > 35.0 && actual.getImc() < 39.9);
    }

    @Test
    void retornaImc_deve_retornar_classificacao_obesidade_III_quando_imc_for_maior_que_40() {
        var actual = service.retornaImc(126.0, 1.75);
        assertEquals("Obesidade Grau III (mórbida)", actual.getClassificacao());
        assertTrue(actual.getImc() > 40.0);
    }

}