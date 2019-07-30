package com.anakin.generator.model.cvt;

import com.anakin.generator.entity.UserInfo;
import com.anakin.generator.model.dto.UserInfoDTO;
import com.anakin.generator.model.vo.UserInfoVO;
import org.springframework.beans.BeanUtils;

/**
 *@description: TODO
 *@author: JPA AUTO
 *@date: Thu Jul 18 21:58:23 CST 2019
 */
public class UserInfoConvert {

	public static UserInfo DTOToEntity(UserInfoDTO dto) {
		UserInfo entity = new UserInfo();
		BeanUtils.copyProperties(dto,entity);
		return entity;
	}

	public static UserInfoVO EntityToVO(UserInfo entity) {
		UserInfoVO vo = new UserInfoVO();
		BeanUtils.copyProperties(entity,vo);
		return vo;
	}

}
