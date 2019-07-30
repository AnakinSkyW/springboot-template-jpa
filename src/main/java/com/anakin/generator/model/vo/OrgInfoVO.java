package com.anakin.generator.model.vo;

import lombok.*;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 *@description: TODO
 *@author: JPA AUTO
 *@date: Tue Jul 30 22:24:14 CST 2019
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "org_infoVO")
public class OrgInfoVO implements Serializable {
	@ApiModelProperty(value = "null")
	private Long id;
	@ApiModelProperty(value = "null")
	private String orgName;
	@ApiModelProperty(value = "null")
	private Integer orgType;
}
