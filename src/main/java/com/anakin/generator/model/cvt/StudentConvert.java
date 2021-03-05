package com.anakin.generator.model.cvt;

import com.anakin.generator.entity.Student;
import com.anakin.generator.model.dto.StudentDTO;
import com.anakin.generator.model.vo.StudentVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 *@description: Student Converter
 *@author: JPA AUTO
 *@date: Fri Mar 05 16:00:00 CST 2021
 */
@Mapper
public interface StudentConvert {

	StudentConvert INSTANCE = Mappers.getMapper(StudentConvert.class);

	/**
	 * convert to vo
	 * @param entity
	 * @return vo
	 */
	StudentVO toVO(Student entity);

	/**
	 * convert to entity
	 * @param dto
	 * @return entity 
	 */
	Student toEntity(StudentDTO dto);

}
