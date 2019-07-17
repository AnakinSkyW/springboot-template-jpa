package com.anakin.generator.enums;

/**
 * Description: TODO
 * User: AnakinSkyW
 * Date: 2019/7/17 22:40
 **/
public enum  CodeMsg {
    SUCCESS(200,"请求成功"),
    FAIL(500,"请求失败");

    private int code;
    private String message;

    CodeMsg(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
