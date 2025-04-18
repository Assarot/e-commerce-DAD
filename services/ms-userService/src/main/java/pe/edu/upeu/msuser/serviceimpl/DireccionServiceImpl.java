package pe.edu.upeu.msuser.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.msuser.dao.DireccionDao;
import pe.edu.upeu.msuser.domain.Direccion;
import pe.edu.upeu.msuser.service.DireccionService;

import java.util.List;
import java.util.Optional;
@Service
public class DireccionServiceImpl implements DireccionService {
    @Autowired
    private DireccionDao direccionDao;
    @Override
    public Direccion create(Direccion d) {
        return direccionDao.create(d);
    }

    @Override
    public Direccion edit(Direccion d) {
        return direccionDao.edit(d);
    }

    @Override
    public void delete(Long id) {
        direccionDao.delete(id);
    }

    @Override
    public Optional<Direccion> read(Long id) {
        return direccionDao.read(id);
    }

    @Override
    public List<Direccion> readAll() {
        return direccionDao.readAll();
    }
}
