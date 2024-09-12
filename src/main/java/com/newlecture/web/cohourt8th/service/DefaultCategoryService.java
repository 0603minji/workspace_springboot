package com.newlecture.web.cohourt8th.service;

import com.newlecture.web.cohourt8th.entity.Category;
import com.newlecture.web.cohourt8th.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultCategoryService implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getList() {
        return categoryRepository.findAll();
    }
}
