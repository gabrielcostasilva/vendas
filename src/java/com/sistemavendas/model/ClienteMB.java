package com.sistemavendas.model;

import java.util.Date;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class ClienteMB {
    
    private String nome;
    private int idade;
    private Date dataNascimento;
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public String executar() {
        return "sucesso";
    }
    
}
