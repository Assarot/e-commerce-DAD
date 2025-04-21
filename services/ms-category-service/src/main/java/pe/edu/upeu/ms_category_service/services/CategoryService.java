package pe.edu.upeu.ms_category_service.services;

import pe.edu.upeu.ms_category_service.domain.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    List<Category> findAllCategories();
    Optional<Category> findCategoryById(Long id);
    Category createCategory(Category category);
    Category updateCategory(Long id, Category category);
    void deleteCategory(Long id);
}
