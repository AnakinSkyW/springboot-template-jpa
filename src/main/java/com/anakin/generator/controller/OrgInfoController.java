package com.anakin.generator.controller;

import com.anakin.generator.common.ApiDataResult;
import com.anakin.generator.common.ApiResult;
import com.anakin.generator.enums.CodeMsg;
import com.anakin.generator.model.dto.OrgInfoDTO;
import com.anakin.generator.model.vo.OrgInfoVO;
import com.anakin.generator.service.OrgInfoService;

import com.anakin.generator.util.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description: OrgInfo Controller
 * @author: JPA AUTO
 * @date Tue Jul 30 22:23:22 CST 2019
 */
@Slf4j
@Api(tags = "OrgInfo Controller")
@RestController
@RequestMapping("OrgInfo")
public class OrgInfoController {

    @Autowired
    private OrgInfoService orgInfoService;

    @PostMapping
    @ApiOperation(value = "add OrgInfo")
    public ApiResult add(@Validated @RequestBody OrgInfoDTO dto) {
        log.info("add OrgInfo:dto-{}",dto);
        orgInfoService.add(dto);
        return ResultUtil.response(CodeMsg.SUCCESS);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "delete OrgInfo")
    public ApiResult delete(@PathVariable Long id) {
        log.info("update OrgInfo:key-{}",id);
        orgInfoService.delete(id);
        return ResultUtil.response(CodeMsg.SUCCESS);
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "update OrgInfo")
    public ApiResult update(@PathVariable Long id, @Validated @RequestBody OrgInfoDTO dto) {
        log.info("update OrgInfo:key-{},dto-{}",id,dto);
        orgInfoService.update( dto);
        return ResultUtil.response(CodeMsg.SUCCESS);
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "query OrgInfo")
    public ApiDataResult<OrgInfoVO> find(@PathVariable Long id) {
        log.info("find OrgInfo:key-{}",id);
        return ResultUtil.response(CodeMsg.SUCCESS,orgInfoService.find(id));
    }

    @GetMapping
    @ApiOperation(value = "query list")
    public ApiDataResult<List<OrgInfoVO>> find(@Validated @RequestParam OrgInfoDTO dto) {
        log.info("find OrgInfo:dto-{}",dto);
        return ResultUtil.response(CodeMsg.SUCCESS,orgInfoService.find(dto));
    }

    @GetMapping("/page")
    @ApiOperation(value = "query list by page")
    public ApiDataResult<Page<OrgInfoVO>> find(@RequestParam Integer pageNum, @RequestParam Integer pageSize) {
        log.info("find OrgInfo:pageNum-{},pageSize-{}",pageNum,pageSize);
        return ResultUtil.response(CodeMsg.SUCCESS,orgInfoService.find(pageNum,pageSize));
    }

}
