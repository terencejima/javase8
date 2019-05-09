package com.general;

/**
 * Created by Terence on 10/01/2017.
 */
public class Testing {
    private int num;
    private String name;
    private int vol;

    public Testing(int num) {
        this(num, "Jima");
    }

    public Testing(int num, String name) {
        this.vol = 4;
        this.num = num;
        this.name = name;
    }

    public static void main(String[] args) {

        Testing testing = new Testing(10);
        System.out.println(testing.num);
        System.out.println(testing.name);

    }

    public static boolean method1(int i){
        return i>0 ? true : false; }

}
