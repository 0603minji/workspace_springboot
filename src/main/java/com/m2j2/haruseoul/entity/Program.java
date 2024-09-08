package com.m2j2.haruseoul.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Program {
    private Long id;
    private String title;
    private String summary;
    private String detail;
    private String category1;
    private String category2;
    private String language;
    private String startTime;
    private String endTime;
    private String status;
    private Integer price;
    private Integer groupSizeMax;
    private Integer groupSizeMin;
    private Long hostId;

    @Override
    public String toString() {
        return "Program{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", detail='" + detail + '\'' +
                ", category1='" + category1 + '\'' +
                ", category2='" + category2 + '\'' +
                ", language='" + language + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", status='" + status + '\'' +
                ", price=" + price +
                ", groupSizeMax=" + groupSizeMax +
                ", groupSizeMin=" + groupSizeMin +
                ", hostId=" + hostId +
                '}';
    }
}
