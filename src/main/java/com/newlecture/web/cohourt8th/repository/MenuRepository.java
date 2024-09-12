package com.newlecture.web.cohourt8th.repository;

import com.newlecture.web.cohourt8th.entity.Menu;
import com.newlecture.web.cohourt8th.entity.MenuView;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface MenuRepository {
    //@Select("SELECT * FROM MENU")
    List<MenuView> findAll(String query, Integer categoryId);

    void save(Menu menu);

    Menu findById(long id);
}
