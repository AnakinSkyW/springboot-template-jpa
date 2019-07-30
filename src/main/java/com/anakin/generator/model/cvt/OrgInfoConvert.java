package com.anakin.generator.model.cvt;

import com.anakin.generator.entity.OrgInfo;
import com.anakin.generator.model.dto.OrgInfoDTO;
import com.anakin.generator.model.vo.OrgInfoVO;
import org.springframework.beans.BeanUtils;

/**
 *@description: TODO
 *@author: JPA AUTO
 *@date: Tue Jul 30 22:24:15 CST 2019
 */
public class OrgInfoConvert {

	public static OrgInfo DTOToEntity(OrgInfoDTO dto) {
		OrgInfo entity = new OrgInfo();
		BeanUtils.copyProperties(dto,entity);
		return entity;
	}

	public static OrgInfoVO EntityToVO(OrgInfo entity) {
		OrgInfoVO vo = new OrgInfoVO();
		BeanUtils.copyProperties(entity,vo);
		return vo;
	}

}
