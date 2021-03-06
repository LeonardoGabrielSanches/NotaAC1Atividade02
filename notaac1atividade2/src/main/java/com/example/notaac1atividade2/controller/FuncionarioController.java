package com.example.notaac1atividade2.controller;

import java.util.List;

import com.example.notaac1atividade2.entidade.Funcionario;
import com.example.notaac1atividade2.service.FuncionarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * FuncionarioController
 */
@Controller
@RequestMapping("/")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping("/funcionario")
    public ModelAndView getAllFuncionarios() {
        ModelAndView modelAndView = new ModelAndView("funcionarios");

        List<Funcionario> listaFuncionarios = funcionarioService.getAllFuncionarios();

        modelAndView.addObject("funcionarios", listaFuncionarios);

        return modelAndView;
    }

    @PostMapping("/cadastro")
    public String insertFuncionario(@ModelAttribute Funcionario funcionario) {
        funcionarioService.InsertFuncionario(funcionario);
        
        return "redirect:/funcionario";
    }
}