package co.com.theplay.apiprueba.repository;

import co.com.theplay.apiprueba.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PersonaRepository  extends JpaRepository<Persona,Long> {


}


