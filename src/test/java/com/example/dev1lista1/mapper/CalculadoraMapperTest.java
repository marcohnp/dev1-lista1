package com.example.dev1lista1.mapper;

import com.example.dev1lista1.stub.CalculadoraModelStub;
import com.example.dev1lista1.stub.response.CalculadoraResponseStub;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraMapperTest {

    @Test
    void mapToResponse() {
        assertEquals(CalculadoraResponseStub.createCalculadoraResponseStub(),
                CalculadoraMapper.mapToResponse(CalculadoraModelStub.createCalculadoraModelStub()));
    }

}