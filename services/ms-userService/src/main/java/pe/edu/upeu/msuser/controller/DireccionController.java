package pe.edu.upeu.msuser.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upeu.msuser.domain.Direccion;
import pe.edu.upeu.msuser.service.DireccionService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ms-user/direcciones")
public class DireccionController {
    @Autowired
    private DireccionService direccionService;

    @GetMapping
    public ResponseEntity<List<Direccion>> readAll() {
        try {
            List<Direccion> direcciones = direccionService.readAll();
            if (direcciones.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(direcciones, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Direccion> read(@PathVariable("id") Long id) {
        try {
            Direccion direccion = direccionService.read(id).get();
            return new ResponseEntity<>(direccion, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Direccion> insert(@Valid @RequestBody Direccion direccion) {
        try {
            Direccion dir = direccionService.create(direccion);
            return new ResponseEntity<>(dir, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@Valid @RequestBody Direccion direccion, @PathVariable Long id) {
        Optional<Direccion> d = direccionService.read(id);
        if (d.isPresent()) {
            return new ResponseEntity<>(direccionService.edit(direccion), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
