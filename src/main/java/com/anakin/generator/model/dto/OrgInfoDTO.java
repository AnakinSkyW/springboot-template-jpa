package com.anakin.generator.model.dto;

import lombok.*;

import java.io.Serializable;

import javax.persistence.*;
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
@ApiModel(description = "org_infoDTO")
public class OrgInfoDTO implements Serializable {
	@ApiModelProperty(value = "null")
	private Long id;
	@ApiModelProperty(value = "null")
	private String orgName;
	@ApiModelProperty(value = "null")
	private Integer orgType;
}
