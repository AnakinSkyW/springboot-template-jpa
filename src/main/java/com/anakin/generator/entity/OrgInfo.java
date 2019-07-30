package com.anakin.generator.entity;

import lombok.Data;

import java.io.Serializable;

import javax.persistence.*;

/**
 * null
 */
@Data
@Entity
@Table(name = "org_info")
public class OrgInfo implements Serializable {

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
	@Column(name = "org_name", nullable = true, length = 255, columnDefinition = "varchar")
	private String orgName;

	/**
	 * null
	 * default value: null
	 */
	@Column(name = "org_type", nullable = true, length = 1, columnDefinition = "smallint")
	private Integer orgType;
}
