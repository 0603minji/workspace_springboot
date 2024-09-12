package com.newlecture.web.cohourt8th.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.newlecture.web.cohourt8th.entity.Notice;

import java.util.ArrayList;




//@Repository
public class DefaultRepository implements NoticeRepository{

    @Override
    public List<Notice> findAll() {
        List<Notice> notices = new ArrayList<Notice>();
//        notices.add(new Notice(1,"minji", "babo"));
//        notices.add(new Notice(1,"minji", "babo"));
//        notices.add(new Notice(1,"minji", "babo"));
        return  notices;
    }

    
}
