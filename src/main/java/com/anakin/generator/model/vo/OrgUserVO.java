package com.anakin.generator.model.vo;

import lombok.*;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 *@description: OrgUser VO
 *@author: JPA AUTO
 *@date: Tue Jul 30 22:19:13 CST 2019
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "OrgUser VO")
public class OrgUserVO implements Serializable {
	@ApiModelProperty(value = "null")
	private Long id;
	@ApiModelProperty(value = "null")
	private Long userId;
	@ApiModelProperty(value = "null")
	private Long orgId;
}
