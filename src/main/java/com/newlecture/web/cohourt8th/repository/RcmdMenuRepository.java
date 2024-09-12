package com.newlecture.web.cohourt8th.repository;

import com.newlecture.web.cohourt8th.entity.RcmdMenu;
import com.newlecture.web.cohourt8th.entity.RcmdMenuView;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RcmdMenuRepository {

    List<RcmdMenuView> findAllByMenuId(Long id);
}
