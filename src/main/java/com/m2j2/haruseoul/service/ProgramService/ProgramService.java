package com.m2j2.haruseoul.service.ProgramService;

import com.m2j2.haruseoul.entity.ProgramView;

import java.util.List;

public interface ProgramService {

    List<ProgramView> getList(long hostId);
}
