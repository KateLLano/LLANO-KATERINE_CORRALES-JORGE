package com.backend.integrador.service;

import com.backend.integrador.dao.IDao;
import com.backend.integrador.entity.Odontologo;
import org.apache.log4j.Logger;

import java.util.List;

public class OdontologoService {
        private static final Logger LOGGER = Logger.getLogger(OdontologoService.class);

        private IDao<Odontologo> odontologoIDao;

        public OdontologoService(IDao<Odontologo> odontologoIDao) {
            this.odontologoIDao = odontologoIDao;
        }

        public Odontologo registrarOdontologo(Odontologo odontologo){
            return odontologoIDao.registrar(odontologo);
        }

        public List<Odontologo> listarOdontologos(){
            LOGGER.info("Listando los odontologos");
            return odontologoIDao.listarTodos();
        }

}



