package com.springBajo8.springBajo8.repository;

import com.springBajo8.springBajo8.domain.Comorbilidades;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface PacienteRepository extends ReactiveMongoRepository<Comorbilidades,String> {
    Flux<Comorbilidades> findByIdPaciente(String idPaciente);
}
