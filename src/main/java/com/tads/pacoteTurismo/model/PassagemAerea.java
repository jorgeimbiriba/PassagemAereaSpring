package com.tads.pacoteTurismo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class PassagemAerea {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    public String origem;

    public String destino;

    public double preco;

    public PassagemAerea(){}

    public PassagemAerea(String origem, String destino, double preco) {
        this.origem = origem;
        this.destino = destino;
        this.preco = preco;
    }

    public Long getId(){return id;}

    public void setId(Long id){this.id = id;}

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Origem= " + origem +
                "\nDestino= " + destino +
                "\nCategoria= "  +
                "\nPreco= " + String.format("%.2f", preco) ;
    }

    
}
