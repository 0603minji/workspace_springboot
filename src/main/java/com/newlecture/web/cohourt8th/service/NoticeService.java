package com.newlecture.web.cohourt8th.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.newlecture.web.cohourt8th.entity.Notice;

public interface NoticeService {
     List<Notice> getList() throws SQLException, ClassNotFoundException;
}
