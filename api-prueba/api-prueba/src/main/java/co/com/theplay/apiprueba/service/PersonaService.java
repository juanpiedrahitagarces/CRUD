package co.com.theplay.apiprueba.service;

import co.com.theplay.apiprueba.entity.Persona;

import java.util.List;

public interface PersonaService {

    List<Persona> findAll();
    void  insert(Persona persona);
    void  update (Persona persona);
    void  delete (Long id);
}
