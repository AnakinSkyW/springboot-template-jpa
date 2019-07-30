package com.anakin.generator.service.impl;

import com.anakin.generator.repository.UserInfoRepository;
import com.anakin.generator.service.UserInfoService;
import com.anakin.generator.entity.UserInfo;
import com.anakin.generator.model.cvt.UserInfoConvert;
import com.anakin.generator.model.dto.UserInfoDTO;
import com.anakin.generator.model.vo.UserInfoVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 *@description: TODO
 *@author: JPA AUTO
 *@date: Thu Jul 18 21:58:23 CST 2019
 */
@Service
public class UserInfoServiceImpl implements UserInfoService{

	@Resource
	private UserInfoRepository userInfoRepository;

	@Override
	public void add(UserInfoDTO dto) {
		userInfoRepository.save(UserInfoConvert.DTOToEntity(dto));
	}

	@Override
	public void delete(Object key) {
		userInfoRepository.deleteById((Integer)key);
	}

	@Override
	public void update(UserInfoDTO dto) {
		userInfoRepository.save(UserInfoConvert.DTOToEntity(dto));
	}

	@Override
	public UserInfoVO find(Object key) {
		return UserInfoConvert.EntityToVO(userInfoRepository.findById((Integer)key).orElse(null));
	}

	@Override
	public List<UserInfoVO> find(UserInfoDTO dto) {
		return null;
	}

	@Override
	public Page<UserInfoVO> find(Integer pageNum, Integer pageSize) {
		Page<UserInfo> dataPage = userInfoRepository.findAll(PageRequest.of(pageNum,pageSize));
		return new PageImpl<>(dataPage.getContent().stream().map(UserInfoConvert::EntityToVO).collect(Collectors.toList()));
	}
}
