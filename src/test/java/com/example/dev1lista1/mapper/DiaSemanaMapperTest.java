package com.example.dev1lista1.mapper;

import com.example.dev1lista1.stub.DiaSemanaModelStub;
import com.example.dev1lista1.stub.response.DiaSemanaResponseStub;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaSemanaMapperTest {

    @Test
    void mapToResponse() {
        assertEquals(DiaSemanaResponseStub.createDiaSemanaResponseStub(),
                DiaSemanaMapper.mapToResponse(DiaSemanaModelStub.createDiaSemanaModelStub()));
    }
}