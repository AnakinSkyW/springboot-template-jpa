package com.anakin.generator.model.dto;

import lombok.*;

import java.io.Serializable;

import javax.persistence.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 *@description: OrgUser DTO
 *@author: JPA AUTO
 *@date: Tue Jul 30 22:19:13 CST 2019
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "OrgUser DTO")
public class OrgUserDTO implements Serializable {
	@ApiModelProperty(value = "null")
	private Long id;
	@ApiModelProperty(value = "null")
	private Long userId;
	@ApiModelProperty(value = "null")
	private Long orgId;
}
