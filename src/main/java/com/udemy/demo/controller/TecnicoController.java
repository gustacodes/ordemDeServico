package com.udemy.demo.controller;

import com.udemy.demo.domain.Tecnico;
import com.udemy.demo.respositorie.TecnicoRespository;
import com.udemy.demo.services.TecnicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/tecnicos")
public class TecnicoController {

    @Autowired
    private TecnicoService tecnico;

    @GetMapping("/{id}")
    public ResponseEntity<Tecnico> buscaId(@PathVariable Integer id) {
        Tecnico t = tecnico.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(t);
    }
}
