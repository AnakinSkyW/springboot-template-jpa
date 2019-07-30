package com.anakin.generator.common;

import com.anakin.generator.enums.CodeMsg;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @description: 返回响应体
 * @author: yujie
 * @date 2019/4/24 10:43
 */
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel(description = "返回响应体,带data数据")
public class ApiDataResult<T> extends ApiResult {
    @ApiModelProperty(value = "返回数据")
    private T data;

    public ApiDataResult(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ApiDataResult(CodeMsg codeMsg, T data) {
        this.code = codeMsg.getCode();
        this.message = codeMsg.getMsg();
        this.data = data;

    }
}
