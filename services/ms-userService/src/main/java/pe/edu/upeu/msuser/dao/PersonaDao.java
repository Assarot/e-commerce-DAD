package pe.edu.upeu.msuser.dao;

import pe.edu.upeu.msuser.domain.Persona;

import java.util.List;
import java.util.Optional;

public interface PersonaDao {
    Persona create(Persona p);
    Persona edit(Persona p);
    void delete(Long id);
    Optional<Persona> read(Long id);
    List<Persona> readAll();
}
