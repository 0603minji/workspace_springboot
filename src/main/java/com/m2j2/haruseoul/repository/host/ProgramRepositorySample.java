package com.m2j2.haruseoul.repository.host;

import com.m2j2.haruseoul.entity.Program;
import com.m2j2.haruseoul.entity.ProgramView;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProgramRepositorySample {

    // 전체 리스트르 가져오는거
    List<ProgramView> findAll();

    List<ProgramView> findByCategory(List<String> categories);

    void saveProgram(Program program);
}
