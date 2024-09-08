package com.m2j2.haruseoul.service.host;

import com.m2j2.haruseoul.entity.ProgramView;
import com.m2j2.haruseoul.repository.host.ProgramRepositorySample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProgramService {

    @Autowired
    private ProgramRepositorySample pr;

    public List<ProgramView> getCategory(List<String> category) {
        System.out.println("ProgramService getCategory 호출");
        System.out.println("category: " + category);


        // 틀린게 아니고, null이면 전체값 주기로 우리 서비스가 약속했기에
        if (category == null || category.isEmpty()) return pr.findAll();

        // todo. 카테고리 정렬을 하고 싶으면 여기서 한다.

        List<ProgramView> result = pr.findByCategory(category);
        return result;
    }


}
