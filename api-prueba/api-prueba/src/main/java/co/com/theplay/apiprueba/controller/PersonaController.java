package co.com.theplay.apiprueba.controller;



import co.com.theplay.apiprueba.service.PersonaService;
import co.com.theplay.apiprueba.entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api-persona")

public class PersonaController {

    @Autowired
    private PersonaService personaService ;
    @GetMapping("/persona")
    public List<Persona>findAll(){
        return personaService.findAll();
    }
    @PostMapping("/persona")
    public void  insert( @RequestBody Persona persona){
        personaService.insert(persona);
    }
    @PutMapping("{id}/persona")
    public void update(@RequestBody Persona persona ,@PathVariable(required = true) Long id){
        personaService.update(persona);
    }
    @DeleteMapping("{id}/persona")
    public  void  delete (@PathVariable Long id){
        personaService.delete(id);


    }
}
