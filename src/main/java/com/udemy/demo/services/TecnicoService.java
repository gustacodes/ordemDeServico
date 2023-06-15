package com.udemy.demo.services;

import com.udemy.demo.domain.Tecnico;
import com.udemy.demo.respositorie.TecnicoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TecnicoService {

    @Autowired
    private TecnicoRespository tecnico;

    public Tecnico findById(Integer id) {
        Optional<Tecnico> tec = tecnico.findById(id);
        return tec.orElse(null);
    }
}
