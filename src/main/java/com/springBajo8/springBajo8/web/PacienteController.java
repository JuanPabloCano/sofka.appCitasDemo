package com.springBajo8.springBajo8.web;

import com.springBajo8.springBajo8.domain.Comorbilidades;
import com.springBajo8.springBajo8.service.impl.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class PacienteController {

    @Autowired
    private PacienteService service;

    @PostMapping("/padecimientos")
    @ResponseStatus(HttpStatus.CREATED)
    private Mono<Comorbilidades> save(@RequestBody Comorbilidades comorbilidades) {
        return service.save(comorbilidades);
    }

    @DeleteMapping("/padecimientos/{id}")
    private Mono<ResponseEntity<Comorbilidades>> delete(@PathVariable("id") String id) {
        return service.delete(id)
                .flatMap(comorbilidades -> Mono.just(ResponseEntity.ok(comorbilidades)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @PutMapping("/padecimientos/{id}")
    private Mono<ResponseEntity<Comorbilidades>> update(@PathVariable("id") String id, @RequestBody Comorbilidades comorbilidades) {
        return service.update(id, comorbilidades)
                .flatMap(comorbilidades1 -> Mono.just(ResponseEntity.ok(comorbilidades1)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @GetMapping("/padecimientos/{idPaciente}")
    private Flux<Comorbilidades> findByidPaciente(@PathVariable("idPaciente") String idPaciente) {
        return service.findByIdPaciente(idPaciente);
    }

    @GetMapping("/padecimientos")
    private Flux<Comorbilidades> findAll() {
        return service.findAll();
    }

}