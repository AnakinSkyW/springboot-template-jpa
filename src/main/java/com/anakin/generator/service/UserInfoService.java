package com.anakin.generator.service;

import com.anakin.generator.model.dto.UserInfoDTO;
import com.anakin.generator.model.vo.UserInfoVO;
import org.springframework.data.domain.Page;
import java.util.List;

/**
 *@description: TODO
 *@author: JPA AUTO
 *@date: Thu Jul 18 21:58:23 CST 2019
 */
public interface UserInfoService {

	/**
	 * add UserInfo
	 * @param dto
	 */
	void add(UserInfoDTO dto);

	/**
	 * delete UserInfo
	 * @param key
	 */
	void delete(Object key);

	/**
	 * update UserInfo
	 * @param dto
	 */
	void update(UserInfoDTO dto);

	/**
	 * query UserInfo
	 * @param key
	 * @return
	 */
	UserInfoVO find(Object key);

	/**
	 * query list
	 * @param dto
	 * @return
	 */
	List<UserInfoVO> find(UserInfoDTO dto);

	/**
	 * query list by page
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	Page<UserInfoVO> find(Integer pageNum, Integer pageSize);

}
