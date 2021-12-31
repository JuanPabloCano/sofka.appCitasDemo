package com.springBajo8.springBajo8.repository;

//import com.yoandypv.reactivestack.messages.domain.Message;
import com.springBajo8.springBajo8.domain.citasDTOReactiva;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface IcitasReactivaRepository extends ReactiveMongoRepository<citasDTOReactiva, String> {
    Flux<citasDTOReactiva> findByIdPaciente(String idPaciente);
    Flux<citasDTOReactiva> findByfechaReservaCitaAndHoraReservaCita(String fechaReservaCita , String HoraReservaCita );
    Mono<citasDTOReactiva> findByIdAndEstadoReservaCitaTrue(String id);

}
