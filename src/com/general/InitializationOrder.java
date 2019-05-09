package com.general;

/**
 * Created by Terence on 10/01/2017.
 */
public class InitializationOrder {

    private String myName = "Torchie";
    {
        System.out.println(myName);
    }

    private static int COUNT = 0;
    static {
        System.out.println(COUNT);
    }

    static {
        COUNT +=10;
        System.out.println(COUNT);
    }

    public InitializationOrder(){
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("main method");
        InitializationOrder init = new InitializationOrder();
       // Testing testing = new Testing(10);
    }
}
