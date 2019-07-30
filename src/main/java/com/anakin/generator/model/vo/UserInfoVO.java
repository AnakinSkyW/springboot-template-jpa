package com.anakin.generator.model.vo;

import lombok.*;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 *@description: UserInfo VO
 *@author: JPA AUTO
 *@date: Tue Jul 30 22:19:12 CST 2019
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "UserInfo VO")
public class UserInfoVO implements Serializable {
	@ApiModelProperty(value = "用户id")
	private Long id;
	@ApiModelProperty(value = "用户名称")
	private String name;
	@ApiModelProperty(value = "年龄")
	private Integer age;
	@ApiModelProperty(value = "邮箱")
	private String email;
}
