package pe.edu.upeu.ms_category_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upeu.ms_category_service.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
