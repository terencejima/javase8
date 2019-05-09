package com.java8.streams;

/**
 * Created by Terence on 03/02/2017.
 */
public class Transaction {
    public static final String GROCERY = "GROCERY";
    public static final String ELECTRONICS = "ELECTRONICS";
    public static final String CLOTHING = "CLOTHING";

    private Double value;
    private String type;
    private int id;

    public Transaction(Double value, String type, int id) {
        this.value = value;
        this.type = type;
        this.id = id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "value=" + value +
                ", type='" + type + '\'' +
                ", id=" + id +
                '}';
    }
}
