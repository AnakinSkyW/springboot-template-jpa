package com.anakin.generator.repository;

import com.anakin.generator.entity.OrgInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

/**
 *@description: Repository Custom Method
 *@author: JPA AUTO
 *@date: Tue Jul 30 22:24:15 CST 2019
 */
public interface OrgInfoRepository extends JpaRepository<OrgInfo, Long>, 
	OrgInfoRepositoryCustom, QuerydslPredicateExecutor<OrgInfo>{

}
