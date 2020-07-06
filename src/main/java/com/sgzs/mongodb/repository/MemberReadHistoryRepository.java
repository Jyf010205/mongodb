package com.sgzs.mongodb.repository;

import com.sgzs.mongodb.entity.MemberReadHistory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/7/2 11:04
 */
public interface MemberReadHistoryRepository extends MongoRepository<MemberReadHistory,String> {
    List<MemberReadHistory> findByMemberIdOrderByCreateTimeDesc(Long memberId);
}
