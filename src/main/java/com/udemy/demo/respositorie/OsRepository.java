package com.udemy.demo.respositorie;

import com.udemy.demo.domain.OS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OsRepository extends JpaRepository<OS, Integer> {

}
