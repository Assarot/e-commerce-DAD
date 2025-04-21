package pe.edu.upeu.msuser.service;

import pe.edu.upeu.msuser.domain.UserRol;

import java.util.List;
import java.util.Optional;

public interface UserRolService {
    UserRol create(UserRol u);
    UserRol edit(UserRol u);
    void delete(Long id);
    Optional<UserRol> read(Long id);
    List<UserRol> readAll();

}
