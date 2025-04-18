package pe.edu.upeu.msuser.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.msuser.dao.TarjetaDao;
import pe.edu.upeu.msuser.domain.Tarjeta;
import pe.edu.upeu.msuser.service.TarjetaService;

import java.util.List;
import java.util.Optional;
@Service
public class TarjetaServiceImpl implements TarjetaService {
    @Autowired
    private TarjetaDao tarjetaDao;
    @Override
    public Tarjeta create(Tarjeta t) {
        return tarjetaDao.create(t);
    }

    @Override
    public Tarjeta edit(Tarjeta t) {
        return tarjetaDao.edit(t);
    }

    @Override
    public void delete(Long id) {
        tarjetaDao.delete(id);
    }

    @Override
    public Optional<Tarjeta> read(Long id) {
        return tarjetaDao.read(id);
    }

    @Override
    public List<Tarjeta> readAll() {
        return tarjetaDao.readAll();
    }
}
