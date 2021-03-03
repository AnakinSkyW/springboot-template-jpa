package com.anakin.generator.model.dto;

import lombok.*;

import java.io.Serializable;

import javax.persistence.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 *@description: 学生 DTO
 *@author: JPA AUTO
 *@date: Wed Mar 03 18:02:23 CST 2021
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "学生 DTO")
public class StudentDTO implements Serializable {
	@ApiModelProperty(value = "主键")
	private Integer id;
	@ApiModelProperty(value = "名称")
	private String name;
	@ApiModelProperty(value = "年龄")
	private Integer age;
	@ApiModelProperty(value = "班级名称")
	private String classname;
}
