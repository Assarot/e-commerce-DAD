package pe.edu.upeu.ms_category_service.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.ms_category_service.domain.Category;
import pe.edu.upeu.ms_category_service.repositories.CategoryRepository;
import pe.edu.upeu.ms_category_service.services.CategoryService;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> findAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> findCategoryById(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(Long id, Category category) {
        Optional<Category> existingCategory = categoryRepository.findById(id);

        if (existingCategory.isPresent()) {
            Category updated = existingCategory.get();
            updated.setName(category.getName());
            updated.setDescription(category.getDescription());
            return categoryRepository.save(updated);
        } else {
            return null; // o puedes lanzar una excepción si prefieres manejar errores
        }
    }

    @Override
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }

}
