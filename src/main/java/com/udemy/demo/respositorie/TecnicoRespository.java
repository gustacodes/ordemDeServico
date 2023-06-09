package com.udemy.demo.respositorie;

import com.udemy.demo.domain.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnicoRespository extends JpaRepository<Tecnico, Integer> {

}
