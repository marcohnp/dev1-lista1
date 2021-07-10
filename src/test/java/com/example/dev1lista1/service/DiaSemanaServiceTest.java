package com.example.dev1lista1.service;

import com.example.dev1lista1.enums.DiaSemanaEnum;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class DiaSemanaServiceTest {

    @InjectMocks
    private DiaSemanaService service;

    @Test
    void retornaDiaSemana_deve_retornar_1_quando_dia_for_domingo() {
        var actual = service.retornaDiaSemana(2021,7,4); // 4/7/2021 - domingo;
        assertEquals(1, actual.getDescricao());
    }

    @Test
    void retornaDiaSemana_deve_retornar_2_quando_dia_for_segunda() {
        var actual = service.retornaDiaSemana(2021,7,5); // 5/7/2021 - segunda;
        assertEquals(2, actual.getDescricao());
    }

    @Test
    void retornaDiaSemana_deve_retornar_3_quando_dia_for_terca() {
        var actual = service.retornaDiaSemana(2021,7,6); // 6/7/2021 - terca;
        assertEquals(3, actual.getDescricao());
    }

    @Test
    void retornaDiaSemana_deve_retornar_4_quando_dia_for_quarta() {
        var actual = service.retornaDiaSemana(2021,7,7); // 7/7/2021 - quarta;
        assertEquals(4, actual.getDescricao());
    }

    @Test
    void retornaDiaSemana_deve_retornar_5_quando_dia_for_quinta() {
        var actual = service.retornaDiaSemana(2021,7,8); // 8/7/2021 - quinta;
        assertEquals(5, actual.getDescricao());
    }

    @Test
    void retornaDiaSemana_deve_retornar_6_quando_dia_for_sexta() {
        var actual = service.retornaDiaSemana(2021,7,9); // 9/7/2021 - sexta;
        assertEquals(6, actual.getDescricao());
    }

    @Test
    void retornaDiaSemana_deve_retornar_7_quando_dia_for_sabado() {
        var actual = service.retornaDiaSemana(2021,7,10); // 10/7/2021 - sabado;
        assertEquals(7, actual.getDescricao());
    }


}