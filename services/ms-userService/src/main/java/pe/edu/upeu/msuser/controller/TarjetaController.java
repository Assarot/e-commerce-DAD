package pe.edu.upeu.msuser.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upeu.msuser.domain.Tarjeta;
import pe.edu.upeu.msuser.service.TarjetaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ms-user/tarjertas")
public class TarjetaController {
    @Autowired
    private TarjetaService tarjetaService;

    @GetMapping
    public ResponseEntity<List<Tarjeta>> findAll() {
        try {
            List<Tarjeta> tarjetas = tarjetaService.readAll();
            if (tarjetas.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(tarjetas, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tarjeta> findById(@PathVariable("id") Long id) {
        try {
            Tarjeta tarjeta = tarjetaService.read(id).get();
            return new ResponseEntity<>(tarjeta, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Tarjeta> create(@Valid @RequestBody Tarjeta tarjeta) {
        try {
            Tarjeta p = tarjetaService.create(tarjeta);
            return new ResponseEntity<>(p, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@Valid @RequestBody Tarjeta tarjeta, @PathVariable Long id) {
        Optional<Tarjeta> t = tarjetaService.read(id);
        if (t.isPresent()) {
            return new ResponseEntity<>(tarjetaService.edit(tarjeta), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
