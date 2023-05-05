package co.com.theplay.apiprueba.service.impl;

import co.com.theplay.apiprueba.repository.PersonaRepository;
import co.com.theplay.apiprueba.service.PersonaService;
import co.com.theplay.apiprueba.entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service

public class PersonaSeriviceimpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> findAll() {
        return personaRepository.findAll();
    }

    @Override
    public void insert(Persona persona) {
        if (findById(persona.getId())== null)
            personaRepository.save(persona);
    }

    @Override
    public void update(Persona persona) {
        if (findById(persona.getId())!= null)
            personaRepository.save(persona);
    }
    private Optional<Persona> findById(Long id){
        return  personaRepository.findById(id);

    }
    @Override
    public void delete(Long id) {
        personaRepository.deleteById(id);
    }
}
