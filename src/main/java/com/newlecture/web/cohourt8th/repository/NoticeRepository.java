package com.newlecture.web.cohourt8th.repository;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.newlecture.web.cohourt8th.entity.Notice;


public interface NoticeRepository {
    List<Notice> findAll() throws SQLException, ClassNotFoundException;
} 
