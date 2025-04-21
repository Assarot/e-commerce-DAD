package pe.edu.upeu.msuser.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.msuser.dao.UserRolDao;
import pe.edu.upeu.msuser.domain.UserRol;
import pe.edu.upeu.msuser.service.UserRolService;

import java.util.List;
import java.util.Optional;
@Service
public class UserRolServiceImpl implements UserRolService {
    @Autowired
    private UserRolDao userRolDao;
    @Override
    public UserRol create(UserRol u) {
        return userRolDao.create(u);
    }

    @Override
    public UserRol edit(UserRol u) {
        return userRolDao.edit(u);
    }

    @Override
    public void delete(Long id) {
        userRolDao.delete(id);
    }

    @Override
    public Optional<UserRol> read(Long id) {
        return userRolDao.read(id);
    }

    @Override
    public List<UserRol> readAll() {
        return userRolDao.readAll();
    }
}
