package com.sgzs.mongodb.service;

import com.sgzs.mongodb.entity.MemberReadHistory;

import java.util.List;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/7/2 11:07
 */
public interface MemberReadHistoryService {
    /**
     * 生成浏览记录
     * @param memberReadHistory
     * @return
     */
    int create(MemberReadHistory memberReadHistory);
    /**
     * 批量删除浏览记录
     * @param ids
     * @return
     */
    int delete(List<String> ids);
    /**
     * 获取用户浏览记录
     * @param memberId
     * @return
     */
    List<MemberReadHistory> list(Long memberId);
}
