package com.newlecture.web.cohourt8th.repository;

import com.newlecture.web.cohourt8th.entity.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CategoryRepository {
    List<Category> findAll();
}
