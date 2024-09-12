package com.newlecture.web.cohourt8th.java.exception;

public class Calc {

    public static int add(int a, int b) {
        int result = a + b;
        return result;
    }
    public static int sub(int a, int b) throws 매개변수10000넘는Exception, 음수가되Exception {
        int result = a - b;

        if(a>10000)
            throw new 매개변수10000넘는Exception();

        if(result<0)
            throw new 음수가되Exception();
        return a - b;
    }
    public static int mul(int a, int b) {
        return a * b;
    }
    public static int div(int a, int b) {
        return a / b;
    }
}
