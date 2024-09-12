package com.newlecture.web.cohourt8th.java.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws 매개변수10000넘는Exception {

        try (
                FileInputStream fis = new FileInputStream("");

        ) {
            fis.read();
        } catch (FileNotFoundException e) {
        } catch (IOException ex) {
        }


        System.out.println(Calc.add(20, 30));


        System.out.println(Calc.sub(20, 30));


        System.out.println("프로그램 끝부분");

    }
}
