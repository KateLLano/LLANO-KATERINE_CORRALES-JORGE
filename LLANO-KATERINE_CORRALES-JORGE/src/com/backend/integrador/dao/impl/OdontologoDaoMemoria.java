package com.backend.integrador.dao.impl;

import com.backend.integrador.dao.IDao;
import com.backend.integrador.entity.Odontologo;
import org.apache.log4j.Logger;

import java.util.List;

public class OdontologoDaoMemoria implements IDao<Odontologo> {
    private static final Logger LOGGER = Logger.getLogger(OdontologoDaoMemoria.class);
    private List<Odontologo> odontologosRepository;

    public OdontologoDaoMemoria(List<Odontologo> odontologosRepository) {
        this.odontologosRepository = odontologosRepository;
    }

    public Odontologo registrar(Odontologo odontologo) {
        this.odontologosRepository.add(odontologo);
        LOGGER.info("Odontólogo guardado: " + odontologo);
        return odontologo;
    }

    public List<Odontologo> listarTodos() {
        LOGGER.info("Lista de todos los odontólogos registrados: " + (this.odontologosRepository));
        return this.odontologosRepository;
    }
}
