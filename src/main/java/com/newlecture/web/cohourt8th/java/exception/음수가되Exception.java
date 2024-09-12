package com.newlecture.web.cohourt8th.java.exception;

public class 음수가되Exception extends RuntimeException {
    @Override
    public String getMessage() {
        return "계산 결과값이 음수가 되어 예외가 발생하였습니다.";
    }
}
