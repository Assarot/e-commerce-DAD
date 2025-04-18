package pe.edu.upeu.msuser.dao;

import pe.edu.upeu.msuser.domain.Tarjeta;

import java.util.List;
import java.util.Optional;

public interface TarjetaDao {
    Tarjeta create(Tarjeta t);
    Tarjeta edit(Tarjeta t);
    void delete(Long id);
    Optional<Tarjeta> read(Long id);
    List<Tarjeta> readAll();
}
