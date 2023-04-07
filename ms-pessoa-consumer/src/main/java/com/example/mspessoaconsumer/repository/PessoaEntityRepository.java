package com.example.mspessoaconsumer.repository;

import com.example.mspessoaconsumer.models.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaEntityRepository extends JpaRepository<PessoaEntity, Long> {
}
