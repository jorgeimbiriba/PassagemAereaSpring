package com.tads.pacoteTurismo.dto;

import com.tads.pacoteTurismo.model.PassagemAerea;

public class PassagemAereaInputDto {
    private String origem;
    private String destino;
    private double preco;

    public PassagemAereaInputDto(){}

    public String getOrigem(){return origem;}

    public void setOrigem(String origem){this.origem = origem;}

    public String getDestino(){return destino;}

    public void setDestino(String destino){this.destino = destino;}

    public double getPreco(){return preco;}

    public void setPreco(double preco){this.preco = preco;}


    public PassagemAerea build(){
        PassagemAerea passagemaerea = new PassagemAerea();
        passagemaerea.setOrigem(getOrigem());
        passagemaerea.setDestino(getDestino());
        passagemaerea.setPreco(getPreco());
        return passagemaerea;
    }

    
}
