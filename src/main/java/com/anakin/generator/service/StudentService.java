package com.anakin.generator.service;

import com.anakin.generator.model.dto.StudentDTO;
import com.anakin.generator.model.vo.StudentVO;
import java.util.List;
import com.anakin.common.tool.result.VOPage;

/**
 *@description: Student service
 *@author: JPA AUTO
 *@date: Fri Mar 05 16:00:00 CST 2021
 */
public interface StudentService {

	/**
	 * add Student
	 * @param dto
	 */
	void add(StudentDTO dto);

	/**
	 * delete Student
	 * @param id
	 */
	void delete(Integer id);

	/**
	 * update Student
	 * @param dto
	 * @param id
	 */
	void update(Integer id, StudentDTO dto);

	/**
	 * query Student
	 * @param id
	 * @return
	 */
	StudentVO find(Integer id);

	/**
	 * query list
	 * @param dto
	 * @return
	 */
	List<StudentVO> find(StudentDTO dto);

	/**
	 * query list by page
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	VOPage<StudentVO> find(Integer pageNum, Integer pageSize);

}
