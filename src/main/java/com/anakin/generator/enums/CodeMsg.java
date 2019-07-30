package com.anakin.generator.enums;

/**
 * @description: 通用错误码
 * @author: yujie
 * @date 2019/4/24 9:59
 */
public enum CodeMsg {

    SUCCESS("200", "操作成功"),
    QUERY_SUCCESS("200", "查询成功"),
    SAVE_SUCCESS("200", "新增成功"),
    UPDATE_SUCCESS("200", "修改成功"),
    DELETE_SUCCESS("200", "删除成功"),

    VALIDATE_PARAMETER("400", "无效的参数"),
    UNAUTHORIZED("401", "暂未登录或登录已经过期"),
    FORBIDDEN_ACCESS("403", "禁止访问"),
    FORBIDDEN("409", "没有相关权限"),
    NOT_FOUND_FAILED("404", "请求资源不存在"),

    FAILED("500", "操作失败"),
    SYSTEM_ERROR("500", "系统内部错误");

    private String code;
    private String msg;


    CodeMsg(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
