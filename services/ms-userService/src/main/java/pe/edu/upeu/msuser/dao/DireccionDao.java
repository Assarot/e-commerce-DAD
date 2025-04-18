package pe.edu.upeu.msuser.dao;

import pe.edu.upeu.msuser.domain.Direccion;

import java.util.List;
import java.util.Optional;

public interface DireccionDao {
    Direccion create(Direccion d);
    Direccion edit(Direccion d);
    void delete(Long id);
    Optional<Direccion> read(Long id);
    List<Direccion> readAll();
}
