package pe.edu.upeu.msuser.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.msuser.dao.PersonaDao;
import pe.edu.upeu.msuser.domain.Persona;
import pe.edu.upeu.msuser.service.PersonaService;

import java.util.List;
import java.util.Optional;
@Service
public class PersonaServiceImpl implements PersonaService {
    @Autowired
    private PersonaDao personaDao;
    @Override
    public Persona create(Persona p) {
        return personaDao.create(p);
    }

    @Override
    public Persona edit(Persona p) {
        return personaDao.edit(p);
    }

    @Override
    public void delete(Long id) {
        personaDao.delete(id);
    }

    @Override
    public Optional<Persona> read(Long id) {
        return personaDao.read(id);
    }

    @Override
    public List<Persona> readAll() {
        return personaDao.readAll();
    }
}
