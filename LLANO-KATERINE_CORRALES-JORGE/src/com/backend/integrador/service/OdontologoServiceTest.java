package com.backend.integrador.service;

import com.backend.integrador.dao.impl.OdontologoDaoH2;
import com.backend.integrador.entity.Odontologo;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OdontologoServiceTest {
    @Test
    void listarOdontologos() {
        OdontologoDaoH2 odontologoDaoH2 = new OdontologoDaoH2();
        OdontologoService odontologoService = new OdontologoService(odontologoDaoH2);
        odontologoService.listarOdontologos();
    }
}