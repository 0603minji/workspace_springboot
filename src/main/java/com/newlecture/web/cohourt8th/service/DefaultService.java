package com.newlecture.web.cohourt8th.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.newlecture.web.cohourt8th.entity.Notice;
import com.newlecture.web.cohourt8th.repository.NoticeRepository;

import jakarta.servlet.http.HttpServletResponse;

@Service 
public class DefaultService implements NoticeService {

    @Autowired
    NoticeRepository repository;

    @Override
    public List<Notice> getList() throws SQLException, ClassNotFoundException {
//        List<Notice> notices = repository.findAll();
           return null;
    }
}
