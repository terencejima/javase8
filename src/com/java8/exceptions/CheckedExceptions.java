package com.java8.exceptions;

/**
 * Created by Terence on 13/01/2017.
 */
public class CheckedExceptions {
    public static void main(String[] args){
        // ClassCastException
        try {
            String type = "mouse";
            Object obj = type;
            Integer num = (Integer) obj;
        } finally {
            setNumberEggs(-1);

            // NumberFormatException
            Integer.parseInt("abc");
        }
    }

    // IllegalArgumentException
    public static void setNumberEggs(int numberEggs){
        if(numberEggs < 0){
            throw new IllegalArgumentException(" # eggs must not be negative");
        }
    }
}

