package com.udemy.demo.services;

import com.udemy.demo.domain.Cliente;
import com.udemy.demo.domain.OS;
import com.udemy.demo.domain.Tecnico;
import com.udemy.demo.domain.enuns.Prioridade;
import com.udemy.demo.domain.enuns.Status;
import com.udemy.demo.respositorie.ClienteRespository;
import com.udemy.demo.respositorie.OsRepository;
import com.udemy.demo.respositorie.TecnicoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private OsRepository osRepository;
    @Autowired
    TecnicoRespository tecnicoRespository;
    @Autowired
    ClienteRespository clienteRespository;

    public void instanciaDB() {

        Tecnico t1 = new Tecnico(null, "Gustavo", "085.548.254-03", "(82) 98162-1126");
        Cliente c1 = new Cliente(null, "Mario Juca", "700.291.060-44", "(82) 99568-5214");
        OS os1 = new OS(null, Prioridade.ALTA, "Computador lixo", Status.ANDAMENTO, t1, c1);

        t1.getList().add(os1);
        c1.getList().add(os1);

        tecnicoRespository.saveAll(Arrays.asList(t1));
        clienteRespository.saveAll(Arrays.asList(c1));
        osRepository.saveAll(Arrays.asList(os1));
    }
}
