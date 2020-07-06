package com.sgzs.mongodb.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/7/2 10:59
 */
@Data
@Document
public class MemberReadHistory {
    @Id
    private String id;
    @Indexed
    private Long memberId;
    private String memberNickname;
    private String memberIcon;
    @Indexed
    private Long productId;
    private String prodectName;
    private String prodectPic;
    private String prodectSubTitle;
    private String prodectPrice;
    private Date createTime;
}
