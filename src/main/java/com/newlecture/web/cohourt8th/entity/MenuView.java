package com.newlecture.web.cohourt8th.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MenuView {
    private long id;
    private String korName;
    private String engName;
    private int price;
    private Date regDate;
    private int categoryId;
    private int regMemberId;
    private String img;
}
