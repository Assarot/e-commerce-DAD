package pe.edu.upeu.msuser.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pe.edu.upeu.msuser.dao.PersonaDao;
import pe.edu.upeu.msuser.domain.Persona;
import pe.edu.upeu.msuser.repositories.PersonaRepository;

import java.util.List;
import java.util.Optional;
@Component
public class PersonaDaoImpl implements PersonaDao {
    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Persona create(Persona p) {
        return personaRepository.save(p);
    }

    @Override
    public Persona edit(Persona p) {
        return personaRepository.save(p);
    }

    @Override
    public void delete(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Optional<Persona> read(Long id) {
        return personaRepository.findById(id);
    }

    @Override
    public List<Persona> readAll() {
        return personaRepository.findAll();
    }
}
