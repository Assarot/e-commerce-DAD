package pe.edu.upeu.msuser.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pe.edu.upeu.msuser.dao.TarjetaDao;
import pe.edu.upeu.msuser.domain.Tarjeta;
import pe.edu.upeu.msuser.repositories.TarjetaRepository;

import java.util.List;
import java.util.Optional;
@Component
public class TarjetaDaoImpl implements TarjetaDao {
    @Autowired
    private TarjetaRepository tarjetaRepository;

    @Override
    public Tarjeta create(Tarjeta t) {
        return tarjetaRepository.save(t);
    }

    @Override
    public Tarjeta edit(Tarjeta t) {
        return tarjetaRepository.save(t);
    }

    @Override
    public void delete(Long id) {
        tarjetaRepository.deleteById(id);
    }

    @Override
    public Optional<Tarjeta> read(Long id) {
        return tarjetaRepository.findById(id);
    }

    @Override
    public List<Tarjeta> readAll() {
        return tarjetaRepository.findAll();
    }
}
