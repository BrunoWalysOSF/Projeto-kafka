package com.example.mspessoaconsumer.repository;

import com.example.mspessoaconsumer.models.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaEntityRepository extends JpaRepository<Pessoa, Long> {
}
