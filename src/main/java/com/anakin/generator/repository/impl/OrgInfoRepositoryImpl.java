package com.anakin.generator.repository.impl;

import com.anakin.generator.repository.OrgInfoRepositoryCustom;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *@description: Repository Impl Method
 *@author: JPA AUTO
 *@date: Tue Jul 30 22:24:15 CST 2019
 */
@Repository
public class OrgInfoRepositoryImpl implements OrgInfoRepositoryCustom {

	@PersistenceContext
	private EntityManager entityManager;
}
