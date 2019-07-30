package com.anakin.generator.entity;

import lombok.Data;

import java.io.Serializable;

import javax.persistence.*;

/**
 *@description: OrgUser Entity
 *@author: JPA AUTO
 *@date: Tue Jul 30 22:19:13 CST 2019
 */
@Data
@Entity
@Table(name = "org_user")
public class OrgUser implements Serializable {

	/**
	 * null
	 * default value: null
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = true, length = 20, columnDefinition = "bigint")
	private Long id;

	/**
	 * null
	 * default value: null
	 */
	@Column(name = "user_id", nullable = true, length = 20, columnDefinition = "bigint")
	private Long userId;

	/**
	 * null
	 * default value: null
	 */
	@Column(name = "org_id", nullable = true, length = 20, columnDefinition = "bigint")
	private Long orgId;
}
