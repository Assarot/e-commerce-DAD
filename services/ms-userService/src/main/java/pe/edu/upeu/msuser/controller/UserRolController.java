package pe.edu.upeu.msuser.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upeu.msuser.domain.UserRol;
import pe.edu.upeu.msuser.service.UserRolService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ms-user/user-rol")
public class UserRolController {
    @Autowired
    private UserRolService userRolService;

    @GetMapping
    public ResponseEntity<List<UserRol>> readAll() {
        try {
            List<UserRol> userRols = userRolService.readAll();
            if (userRols.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(userRols, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserRol> read(@PathVariable Long id) {
        try {
            Optional<UserRol> userRol = userRolService.read(id);
            if (userRol.isPresent()) {
                return new ResponseEntity<>(userRol.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<UserRol> create(@Valid @RequestBody UserRol userRol) {
        try {
            UserRol uRol = userRolService.create(userRol);
            return new ResponseEntity<>(uRol, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@Valid @RequestBody UserRol userRol, @PathVariable Long id) {
        Optional<UserRol> userRolOptional = userRolService.read(id);
        if (userRolOptional.isPresent()) {
            return new ResponseEntity<>(userRolService.edit(userRol), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        try {
            userRolService.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
