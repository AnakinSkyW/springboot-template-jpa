package com.anakin.generator.service.impl;

import com.anakin.generator.repository.OrgInfoRepository;
import com.anakin.generator.service.OrgInfoService;
import com.anakin.generator.entity.OrgInfo;
import com.anakin.generator.model.cvt.OrgInfoConvert;
import com.anakin.generator.model.dto.OrgInfoDTO;
import com.anakin.generator.model.vo.OrgInfoVO;
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
 *@date: Tue Jul 30 22:24:15 CST 2019
 */
@Service
public class OrgInfoServiceImpl implements OrgInfoService{

	@Resource
	private OrgInfoRepository orgInfoRepository;

	@Override
	public void add(OrgInfoDTO dto) {
		orgInfoRepository.save(OrgInfoConvert.DTOToEntity(dto));
	}

	@Override
	public void delete(Object key) {
		orgInfoRepository.deleteById((Integer)key);
	}

	@Override
	public void update(OrgInfoDTO dto) {
		orgInfoRepository.save(OrgInfoConvert.DTOToEntity(dto));
	}

	@Override
	public OrgInfoVO find(Object key) {
		return OrgInfoConvert.EntityToVO(orgInfoRepository.findById((Integer)key).orElse(null));
	}

	@Override
	public List<OrgInfoVO> find(OrgInfoDTO dto) {
		return null;
	}

	@Override
	public Page<OrgInfoVO> find(Integer pageNum, Integer pageSize) {
		Page<OrgInfo> dataPage = orgInfoRepository.findAll(PageRequest.of(pageNum,pageSize));
		return new PageImpl<>(dataPage.getContent().stream().map(OrgInfoConvert::EntityToVO).collect(Collectors.toList()));
	}
}
