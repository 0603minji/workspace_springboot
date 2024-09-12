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
public class Menu {
    private Long id;
    private String korName;
    private String engName;
    private Integer price;
//    private String img;
    private Date regDate;
    private Integer categoryId;
    private Integer regMemberId;
    private String description;
}
