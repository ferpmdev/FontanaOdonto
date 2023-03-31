package com.example.FontanaOdonto.service;

import com.example.FontanaOdonto.model.OdontologoDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class OdontologoServiceTest {

    @Autowired
    private IOdontologoService odontologoService;

    @Test
    public void testCrearOdontologo(){
        OdontologoDTO odontologoDTO = new OdontologoDTO();
        odontologoDTO.setNombre("Pedro");
        odontologoDTO.setApellido("Aznar");
        odontologoService.crearOdontologo(odontologoDTO);
        OdontologoDTO odontologoPedro = odontologoService.leerOdontologo(1);

        assertTrue(odontologoPedro == null);
    }
}
