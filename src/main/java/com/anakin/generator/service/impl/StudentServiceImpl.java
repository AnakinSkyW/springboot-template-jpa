package com.anakin.generator.service.impl;

import com.anakin.common.tool.enums.CodeMsg;
import com.anakin.common.tool.exception.CommonException;
import com.anakin.generator.repository.StudentRepository;
import com.anakin.generator.service.StudentService;
import com.anakin.generator.model.cvt.StudentConvert;
import com.anakin.generator.model.dto.StudentDTO;
import com.anakin.generator.model.vo.StudentVO;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.anakin.common.tool.result.VOPage;
import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 *@description: Student service impl
 *@author: JPA AUTO
 *@date: Fri Mar 05 16:00:00 CST 2021
 */
@Service
public class StudentServiceImpl implements StudentService {

	@Resource
	private StudentRepository studentRepository;

	@Override
	public void add(StudentDTO dto) {
		studentRepository.save(StudentConvert.INSTANCE.toEntity(dto));
	}

	@Override
	public void delete(Integer id) {
		studentRepository.deleteById(id);
	}

	@Override
	public void update(Integer id, StudentDTO dto) {
		studentRepository.save(StudentConvert.INSTANCE.toEntity(dto));
	}

	@Override
	public StudentVO find(Integer id) {
		return StudentConvert.INSTANCE.toVO(studentRepository
				.findById(id)
				.orElseThrow(() -> new CommonException(CodeMsg.NOT_FOUND_FAILED)));
	}

	@Override
	public List<StudentVO> find(StudentDTO dto) {
		return studentRepository
				.findAll(Example.of(StudentConvert.INSTANCE.toEntity(dto)))
				.stream()
				.map(StudentConvert.INSTANCE::toVO)
				.collect(Collectors.toList());
	}

	@Override
	public VOPage<StudentVO> find(Integer pageNum, Integer pageSize) {
		return VOPage.restPage(studentRepository
				.findAll(PageRequest.of(pageNum-1,pageSize))
				.map(StudentConvert.INSTANCE::toVO));
	}

}
