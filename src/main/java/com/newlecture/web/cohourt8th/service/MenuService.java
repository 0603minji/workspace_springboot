package com.newlecture.web.cohourt8th.service;

import com.newlecture.web.cohourt8th.entity.Category;
import com.newlecture.web.cohourt8th.entity.Menu;
import com.newlecture.web.cohourt8th.entity.MenuView;
import com.newlecture.web.cohourt8th.model.MenuDetailModel;

import java.util.List;

public interface MenuService {
    List<MenuView> getList();
    List<MenuView> getList(String query, Integer categoryId);

    void reg(Menu menu);

    Menu getById(Long id);

    MenuDetailModel getDetailById(Long id);
}
