package com.newlecture.web.cohourt8th.repository;

import com.newlecture.web.cohourt8th.entity.MenuImage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuImageRepository {

    List<MenuImage> findAllByMenuId(Long id);
}
