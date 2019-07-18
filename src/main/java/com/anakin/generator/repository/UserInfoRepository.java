package com.anakin.generator.repository;

import com.anakin.generator.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

/**
 *@description: Repository Custom Method
 *@author: JPA AUTO
 *@date: Thu Jul 18 21:58:23 CST 2019
 */
public interface UserInfoRepository extends JpaRepository<UserInfo, Long>, 
	UserInfoRepositoryCustom, QuerydslPredicateExecutor<UserInfo>{

}
