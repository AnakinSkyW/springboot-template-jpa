package com.anakin.generator.controller;

import com.anakin.generator.model.dto.StudentDTO;
import com.anakin.generator.model.vo.StudentVO;
import com.anakin.generator.service.StudentService;
import com.anakin.common.tool.result.ApiDataResult;
import com.anakin.common.tool.result.ApiResult;
import com.anakin.common.tool.enums.CodeMsg;
import com.anakin.common.tool.result.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import com.anakin.common.tool.result.VOPage;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description: Student Controller
 * @author: JPA AUTO
 * @date Fri Mar 05 16:00:00 CST 2021
 */
@Slf4j
@Api(tags = "Student Controller")
@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    @ApiOperation(value = "add Student")
    public ApiResult add(@Validated @RequestBody StudentDTO dto) {
        studentService.add(dto);
        return ResultUtil.response(CodeMsg.SUCCESS);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "delete Student")
    public ApiResult delete(@PathVariable Integer id) {
        studentService.delete(id);
        return ResultUtil.response(CodeMsg.SUCCESS);
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "update Student")
    public ApiResult update(@PathVariable Integer id, @Validated @RequestBody StudentDTO dto) {
        studentService.update(id, dto);
        return ResultUtil.response(CodeMsg.SUCCESS);
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "query Student")
    public ApiDataResult<StudentVO> find(@PathVariable Integer id) {
        return ResultUtil.response(CodeMsg.SUCCESS,studentService.find(id));
    }

    @GetMapping
    @ApiOperation(value = "query list")
    public ApiDataResult<List<StudentVO>> find(StudentDTO dto) {
        return ResultUtil.response(CodeMsg.SUCCESS,studentService.find(dto));
    }

    @GetMapping("/page")
    @ApiOperation(value = "query list by page")
    public ApiDataResult<VOPage<StudentVO>> find(@RequestParam Integer pageNum, @RequestParam Integer pageSize) {
        return ResultUtil.response(CodeMsg.SUCCESS,studentService.find(pageNum,pageSize));
    }

}
