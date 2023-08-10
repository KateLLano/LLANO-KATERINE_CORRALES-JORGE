package com.backend.integrador.test;

import com.backend.integrador.dao.impl.OdontologoDaoH2;
import com.backend.integrador.dao.impl.OdontologoDaoMemoria;
import com.backend.integrador.entity.Odontologo;
import com.backend.integrador.service.OdontologoService;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OdontologoServiceTest {
    private OdontologoService odontologoService = null;
    @Test
    void deberiaListarOdontologosH2() {
        OdontologoDaoH2 odontologoDaoH2 = new OdontologoDaoH2();
        odontologoService = new OdontologoService(odontologoDaoH2);
        assertEquals(4, odontologoService.listarOdontologos().size());
    }

    @Test
    void deberiaAgregarUnOdontologoALaBaseDeDatos() {
        OdontologoDaoH2 odontologoDaoH2 = new OdontologoDaoH2();
        odontologoService = new OdontologoService(odontologoDaoH2);
        Odontologo odontologoTest = new Odontologo(13423, "Nathalia", "Sanchez");
        Odontologo odontologoResultado = odontologoService.registrarOdontologo(odontologoTest);
        assertNotNull("Nathalia", odontologoResultado.getNombre());
    }

    @Test
    void deberiaListarOdontologosMemoria() {
        List<Odontologo> odontologoListTest = new ArrayList<>();
        Odontologo odontologoTest = new Odontologo(1, 123423, "Thara", "Corrales");
        odontologoListTest.add(odontologoTest);
        OdontologoDaoMemoria odontologoDaoMemoria = new OdontologoDaoMemoria(odontologoListTest);
        odontologoService = new OdontologoService(odontologoDaoMemoria);
        assertEquals(1, odontologoService.listarOdontologos().size());
    }
}