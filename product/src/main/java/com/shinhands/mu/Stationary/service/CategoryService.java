package com.shinhands.mu.Stationary.service;

import com.shinhands.mu.Stationary.dto.CategoryDTO;

import java.util.List;

public interface CategoryService {
     public List<CategoryDTO> getAllCategories();
     public CategoryDTO addCategory(CategoryDTO category);
     Boolean deleteCategory(long id);
     public CategoryDTO getCategoryById(long id);
     public Boolean updateCategory(long id, CategoryDTO category);
}
