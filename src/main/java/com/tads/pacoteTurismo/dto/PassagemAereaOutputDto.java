package com.tads.pacoteTurismo.dto;

import com.tads.pacoteTurismo.model.PassagemAerea;

public class PassagemAereaOutputDto {
    private Long id;
    private String origem;
    private String destino;
    public double preco;

    public PassagemAereaOutputDto(PassagemAerea passagemAerea){
        setOrigem(passagemAerea.getOrigem());
        setDestino(passagemAerea.destino);
        setPreco(passagemAerea.preco);
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

}
