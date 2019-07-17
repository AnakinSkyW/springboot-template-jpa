package com.anakin.generator.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Description: response package
 * User: AnakinSkyW
 * Date: 2019/7/17 22:35
 **/
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ApiResult {
    private String code;
    private String message;
}
