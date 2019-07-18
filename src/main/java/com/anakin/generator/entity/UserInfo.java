package com.anakin.generator.entity;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

/**
 * Description: user_info entity
 * User: JPA AUTO
 * Date: Thu Jul 18 22:19:01 CST 2019
 **/
@Data
@Entity
@Table(name = "user_info")
public class UserInfo implements Serializable {

	/**
	 * 用户id
	 * default value: null
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, length = 20, columnDefinition = "bigint")
	private Long id;

	/**
	 * 用户名称
	 * default value: null
	 */
	@Column(name = "name", nullable = true, length = 255, columnDefinition = "varchar")
	private String name;

	/**
	 * 年龄
	 * default value: null
	 */
	@Column(name = "age", nullable = true, length = 3, columnDefinition = "int")
	private Integer age;

	/**
	 * 邮箱
	 * default value: null
	 */
	@Column(name = "email", nullable = true, length = 255, columnDefinition = "varchar")
	private String email;
}
