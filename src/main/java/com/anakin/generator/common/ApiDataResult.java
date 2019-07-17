package com.anakin.generator.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Description: response body package
 * User: AnakinSkyW
 * Date: 2019/7/17 22:37
 **/
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ApiDataResult<T> extends ApiResult{
    private T   data;
}
