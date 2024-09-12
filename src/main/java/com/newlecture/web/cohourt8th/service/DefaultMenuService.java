package com.newlecture.web.cohourt8th.service;

import com.newlecture.web.cohourt8th.entity.*;
import com.newlecture.web.cohourt8th.model.MenuDetailModel;
import com.newlecture.web.cohourt8th.repository.MenuImageRepository;
import com.newlecture.web.cohourt8th.repository.MenuRepository;
import com.newlecture.web.cohourt8th.repository.RcmdMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class DefaultMenuService implements MenuService{
    @Autowired
    private MenuRepository menuRepository;

    @Autowired
    private MenuImageRepository menuImageRepository;

    @Autowired
    private RcmdMenuRepository rcmdMenuRepository;

    @Override
    public List<MenuView> getList() {
        return menuRepository.findAll(null, null);
    }

    @Override
    public List<MenuView> getList(String query,Integer categoryId) {
        return menuRepository.findAll(query, categoryId);
    }

    @Override
    public void reg(Menu menu) {
        menuRepository.save(menu);
    }

    @Override
    public Menu getById(Long id) {
        return menuRepository.findById(id);
    }

    @Override
    public MenuDetailModel getDetailById(Long id) {
        Menu menu = menuRepository.findById(id);
        List<MenuImage> images = menuImageRepository.findAllByMenuId(id);
        List<RcmdMenuView> rcmdMenus = rcmdMenuRepository.findAllByMenuId(id);

        MenuDetailModel menuDetailModel = MenuDetailModel.builder().menu(menu).images(images)
                .rcmdMenus(rcmdMenus).build();

        return menuDetailModel;
    }

}
