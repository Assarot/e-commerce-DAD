package pe.edu.upeu.msuser.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pe.edu.upeu.msuser.dao.UserRolDao;
import pe.edu.upeu.msuser.domain.UserRol;
import pe.edu.upeu.msuser.repositories.UserRolRepository;

import java.util.List;
import java.util.Optional;
@Component
public class UserRolDaoImpl implements UserRolDao {
    @Autowired
    private UserRolRepository repo;
    @Override
    public UserRol create(UserRol u) {
        return repo.save(u);
    }

    @Override
    public UserRol edit(UserRol u) {
        return repo.save(u);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Optional<UserRol> read(Long id) {
        return repo.findById(id);
    }

    @Override
    public List<UserRol> readAll() {
        return repo.findAll();
    }
}
