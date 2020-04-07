package com.example.notaac1atividade2.service;

import java.util.List;

import com.example.notaac1atividade2.entidade.Funcionario;
import com.example.notaac1atividade2.repository.FuncionarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * FuncionarioService
 */
@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<Funcionario> getAllFuncionarios() {
        return funcionarioRepository.findAll();
    }

    
}