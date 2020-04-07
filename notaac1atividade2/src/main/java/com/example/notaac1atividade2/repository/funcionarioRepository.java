package com.example.notaac1atividade2.repository;

import com.example.notaac1atividade2.entidade.Funcionario;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * funcionarioRepository
 */
public interface funcionarioRepository extends JpaRepository<Funcionario,Integer> {

    
}