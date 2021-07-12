package com.example.dev1lista1.facade;

import com.example.dev1lista1.mapper.ImcMapper;
import com.example.dev1lista1.service.ImcService;
import com.example.dev1lista1.stub.ImcModelStub;
import com.example.dev1lista1.stub.response.ImcResponseStub;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ImcFacadeTest {

    @Mock
    private ImcService service;

    @InjectMocks
    private ImcFacade facade;

    @Test
    void retornaImc_deve_retonar_imcResponse_quando_uma_request_for_valida(){
        when(service.retornaImc(any(),any())).thenReturn(ImcModelStub.createImcModelStub());
        assertEquals(ImcResponseStub.createImcResponseStub(),facade.retornaImc(80.0, 1.75));
        verify(service, times(1)).retornaImc(80.0, 1.75);
    }
}