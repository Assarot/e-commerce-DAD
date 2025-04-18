package pe.edu.upeu.msuser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.msuser.domain.Persona;
@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
