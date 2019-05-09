package com.general;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * Created by Terence on 18/01/2017.
 */
public class InitTest {
    static final int i = 1;

    public InitTest(){
        s1 = sM1("1");
    }

    static String s1 = sM1("a");

    String s3 = sM1("2");

    {
        s1 = sM1("3");
    }

    static{
        s1 = sM1("b");
    }

    static String s2 = sM1("c");

    String s4 = sM1("4");

    public static void main(String args[]){
        InitTest it = new InitTest();
        boolean b1 = false; boolean b2 = false;

    }

    private static String sM1(String s){
        System.out.println(s);  return s;
    }
}
