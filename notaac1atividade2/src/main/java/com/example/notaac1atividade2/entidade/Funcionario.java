package com.example.notaac1atividade2.entidade;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * funcionario
 */
@Entity
public class Funcionario implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    private int id;
    private String nome;
    private String cpf;
    private String funcao;
    private double salario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "funcionario [cpf=" + cpf + ", funcao=" + funcao + ", id=" + id + ", nome=" + nome + ", salario="
                + salario + "]";
    }

    public Funcionario(int id, String nome, String cpf, String funcao, double salario) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.funcao = funcao;
        this.salario = salario;
    }
    
    
}