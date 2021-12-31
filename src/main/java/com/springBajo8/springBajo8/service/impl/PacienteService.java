package com.springBajo8.springBajo8.service.impl;


import com.springBajo8.springBajo8.domain.Comorbilidades;
import com.springBajo8.springBajo8.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class PacienteService  {

    @Autowired
    private PacienteRepository repository;


    public Mono<Comorbilidades> save(Comorbilidades comorbilidadesDTOReactivo) {
        return repository.save(comorbilidadesDTOReactivo);
    }


    public Mono<Comorbilidades> delete(String id) {
        return repository
                .findById(id)
                .flatMap(p -> repository.deleteById(p.getId()).thenReturn(p));
    }

    public Mono<Comorbilidades> update(String id, Comorbilidades comorbilidadesDTOReactivo) {
        return repository.findById(id)
                .flatMap(citasDTOReactiva1 -> {
                    comorbilidadesDTOReactivo.setId(id);
                    return save(comorbilidadesDTOReactivo);
                })
                .switchIfEmpty(Mono.empty());
    }


    public Flux<Comorbilidades> findByIdPaciente(String idPaciente) {
        return repository.findByIdPaciente(idPaciente);
    }


    public Flux<Comorbilidades> findAll() {
        return repository.findAll();
    }
}
