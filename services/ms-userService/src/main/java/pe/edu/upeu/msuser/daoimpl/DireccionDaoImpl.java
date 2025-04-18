package pe.edu.upeu.msuser.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pe.edu.upeu.msuser.dao.DireccionDao;
import pe.edu.upeu.msuser.domain.Direccion;
import pe.edu.upeu.msuser.repositories.DireccionRepository;

import java.util.List;
import java.util.Optional;

@Component
public class DireccionDaoImpl implements DireccionDao {
    @Autowired
    private DireccionRepository direccionRepository;
    @Override
    public Direccion create(Direccion d) {
        return direccionRepository.save(d);
    }

    @Override
    public Direccion edit(Direccion d) {
        return direccionRepository.save(d);
    }

    @Override
    public void delete(Long id) {
        direccionRepository.deleteById(id);
    }

    @Override
    public Optional<Direccion> read(Long id) {
        return direccionRepository.findById(id);
    }

    @Override
    public List<Direccion> readAll() {
        return direccionRepository.findAll();
    }
}
