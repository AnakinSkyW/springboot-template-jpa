package com.anakin.generator.entity;

import lombok.*;

import java.io.Serializable;

import javax.persistence.*;

/**
 *@description: 学生 Entity
 *@author: JPA AUTO
 *@date: Wed Mar 03 18:02:23 CST 2021
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
public class Student implements Serializable {

	/**
	 * 主键
	 * default value: null
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, length = 11, columnDefinition = "int")
	private Integer id;

	/**
	 * 名称
	 * default value: null
	 */
	@Column(name = "name", nullable = true, length = 255, columnDefinition = "varchar")
	private String name;

	/**
	 * 年龄
	 * default value: null
	 */
	@Column(name = "age", nullable = true, length = 11, columnDefinition = "int")
	private Integer age;

	/**
	 * 班级名称
	 * default value: null
	 */
	@Column(name = "classname", nullable = true, length = 255, columnDefinition = "varchar")
	private String classname;
}
