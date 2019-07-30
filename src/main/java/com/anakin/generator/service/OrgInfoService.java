package com.anakin.generator.service;

import com.anakin.generator.model.dto.OrgInfoDTO;
import com.anakin.generator.model.vo.OrgInfoVO;
import org.springframework.data.domain.Page;
import java.util.List;

/**
 *@description: TODO
 *@author: JPA AUTO
 *@date: Tue Jul 30 22:24:15 CST 2019
 */
public interface OrgInfoService {

	/**
	 * add OrgInfo
	 * @param dto
	 */
	void add(OrgInfoDTO dto);

	/**
	 * delete OrgInfo
	 * @param key
	 */
	void delete(Object key);

	/**
	 * update OrgInfo
	 * @param dto
	 */
	void update(OrgInfoDTO dto);

	/**
	 * query OrgInfo
	 * @param key
	 * @return
	 */
	OrgInfoVO find(Object key);

	/**
	 * query list
	 * @param dto
	 * @return
	 */
	List<OrgInfoVO> find(OrgInfoDTO dto);

	/**
	 * query list by page
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	Page<OrgInfoVO> find(Integer pageNum, Integer pageSize);

}
