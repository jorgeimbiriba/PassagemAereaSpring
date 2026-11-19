package com.tads.pacoteTurismo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tads.pacoteTurismo.model.PassagemAerea;
public interface PassagemAereaRepository extends JpaRepository <PassagemAerea, Long> {
    
}
