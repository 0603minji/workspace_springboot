package com.newlecture.web.cohourt8th.entity;

import lombok.*;

import java.util.Date;

//@ToString
////@Getter
////@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Notice {

	private long id;
	private String title;
	private String content;
	private int hitCount;
	private Date regDate;
	private Date updateDate;
	private long regMemberId;

//	@Builder
//	public Notice(String title, String content) {
//		this.title = title;
//		this.content = content;
//	}
}
