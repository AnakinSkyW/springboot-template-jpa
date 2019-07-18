package com.anakin.generator.repository.impl;

import com.anakin.generator.repository.UserInfoRepositoryCustom;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *@description: Repository Impl Method
 *@author: JPA AUTO
 *@date: Thu Jul 18 21:58:23 CST 2019
 */
@Repository
public class UserInfoRepositoryImpl implements UserInfoRepositoryCustom {

	@PersistenceContext
	private EntityManager entityManager;
}
