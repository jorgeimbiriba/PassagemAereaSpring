package com.tads.pacoteTurismo.controller;

import java.awt.PageAttributes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.tads.pacoteTurismo.dto.PassagemAereaOutputDto;

@RestController
@RequestMapping("/api/passagemaerea")
public class PassagemAereaController {

    @Autowired
    private PassagemAereaService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PassagemAereaOutpuDto> create(@RequestBody PassagemAereaOutputDto passagemAereaInputDto){

        PassagemAereaOutputDto novaPassagem = passagemService.create(passagemAereaInputDto);

        URI uri = ServletUriComponentsBuilder
            .fromCurrentRequest()
            .path("/{id}")
            .buildAndExpand(novaPassagem.getI())
            .toUri();

        return ResponseEntity.created(uri).body(novaPassagem);
    }
}
