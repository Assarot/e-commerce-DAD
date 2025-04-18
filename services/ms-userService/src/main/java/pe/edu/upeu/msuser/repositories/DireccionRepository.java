package pe.edu.upeu.msuser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.msuser.domain.Direccion;
@Repository
public interface DireccionRepository extends JpaRepository<Direccion, Long> {
}
