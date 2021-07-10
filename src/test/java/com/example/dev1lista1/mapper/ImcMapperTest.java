package com.example.dev1lista1.mapper;

import com.example.dev1lista1.stub.ImcModelStub;
import com.example.dev1lista1.stub.response.ImcResponseStub;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImcMapperTest {

    @Test
    void mapToResponse(){
        assertEquals(ImcResponseStub.createImcResponseStub(),
                ImcMapper.mapToResponse(ImcModelStub.createImcModelStub()));
    }
}