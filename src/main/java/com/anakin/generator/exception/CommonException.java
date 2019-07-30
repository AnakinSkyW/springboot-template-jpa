package com.anakin.generator.exception;

/**
 * Description: custom exception
 * User: AnakinSkyW
 * Date: 2019/7/17 22:46
 **/
public class CommonException extends RuntimeException {

    private int code;
    private String message;

    public CommonException() {
        this.code = CodeMsg.FAIL.getCode();
        this.message = "系统异常";
    }

    public CommonException(CodeMsg codeMsg) {
        super(codeMsg.getMessage());
        this.code = codeMsg.getCode();
        this.message = codeMsg.getMessage();
    }

    public CommonException(CodeMsg codeMsg, String message) {
        super(message);
        this.code = codeMsg.getCode();
        this.message = message;
    }
}
