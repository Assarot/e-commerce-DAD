package pe.edu.upeu.msuser.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upeu.msuser.domain.Persona;
import pe.edu.upeu.msuser.service.PersonaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ms-user/personas")
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @GetMapping
    public ResponseEntity<List<Persona>> readAll() {
        try {
            List<Persona> personas = personaService.readAll();
            if (personas.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(personas, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Persona> read(@PathVariable("id") Long id) {
        try {
            Optional<Persona> persona = personaService.read(id);
            if (persona.isPresent()) {
                return new ResponseEntity<>(persona.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Persona> create(@Valid @RequestBody Persona persona) {
        try {
            Persona p = personaService.create(persona);
            return new ResponseEntity<>(p, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @Valid @RequestBody Persona persona) {
        Optional<Persona> p = personaService.read(id);
        if (p.isPresent()) {
            return new ResponseEntity<>(personaService.edit(persona), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        try {
            personaService.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
