package com.anakin.generator.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @description: 带分页数据VO
 * @author: anakin
 * @date 2019/4/24 11:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "带分页数据vo")
public class VOPage<T> {


    @ApiModelProperty("当前页")
    private Integer pageNum;

    @ApiModelProperty("当前页记录数")
    private Integer pageSize;

    @ApiModelProperty("总页数")
    private Integer totalPage;

    @ApiModelProperty("总记录数")
    private long totalNum;

    @ApiModelProperty("数据列表")
    private List<T> dataList;

    public VOPage(Integer pageNum, Integer pageSize, Long totalNum, List<T> dataList) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.totalNum = totalNum;
        this.dataList = dataList;
        if (totalNum == 0) {
            totalPage = 0;
        }
        if (totalNum <= pageSize) {
            totalPage = 1;
        }
        if (totalNum > pageSize && totalNum%pageSize == 0) {
            totalPage = (int)(totalNum/pageSize);
        }
        if (totalNum > pageSize && totalNum%pageSize > 0) {
            totalPage = (int)(totalNum/pageSize) + 1;
        }
    }

    /**
     * 将SpringData分页后的list转为分页信息
     */
    public static <T> VOPage<T> restPage(Page<T> pageInfo) {
        VOPage<T> result = new VOPage<T>();
        if (null != pageInfo) {
            result.setPageNum(pageInfo.getNumber());
            result.setPageSize(pageInfo.getSize());
            result.setTotalPage(pageInfo.getTotalPages());
            result.setTotalNum(pageInfo.getTotalElements());
            result.setDataList(pageInfo.getContent());
        }
        return result;
    }




}
