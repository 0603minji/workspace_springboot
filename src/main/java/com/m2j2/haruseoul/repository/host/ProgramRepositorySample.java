package com.m2j2.haruseoul.repository.host;

import com.m2j2.haruseoul.entity.ProgramView;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface ProgramRepositorySample {

//    private static List<ProgramView> programs;
//
//    static {
//        programs = new ArrayList<>();
//        for (int i = 0; i < 3; i++) {
//            programs.add(new ProgramView(1L, "111111-", "Activity", "카테고리02",
//                    "모집중", "대표이미지01"));
//        }
//
//        for (int i = 0; i < 4; i++) {
//            programs.add(new ProgramView(1L, "111111-", "Culture", "카테고리02",
//                    "모집중", "대표이미지01"));
//        }
//
//        for (int i = 0; i < 1; i++) {
//            programs.add(new ProgramView(1L, "111111-", "Shopping", "카테고리02",
//                    "모집중", "대표이미지01"));
//        }
//
//        for (int i = 0; i < 7; i++) {
//            programs.add(new ProgramView(1L, "111111-", "Nature", "카테고리02",
//                    "모집중", "대표이미지01"));
//        }
//    }

    // 전체 리스트르 가져오는거
    public List<ProgramView> findAll();

    public List<ProgramView> findByCategory(List<String> categories);

}
