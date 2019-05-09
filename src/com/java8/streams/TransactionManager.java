package com.java8.streams;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

/**
 * Created by Terence on 03/02/2017.
 */
public class TransactionManager {
    public static void main(String[] args) {

        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(200.0, Transaction.GROCERY, 1));
        transactions.add(new Transaction(3_00.0, Transaction.ELECTRONICS, 2));
        transactions.add(new Transaction(55.7, Transaction.GROCERY, 3));
        transactions.add(new Transaction(100.5, Transaction.CLOTHING, 4));
        transactions.add(new Transaction(75.4, Transaction.GROCERY, 5));
        transactions.add(new Transaction(20_5.4, Transaction.GROCERY, 6));

        findTransaction(transactions, Transaction.ELECTRONICS);
        findTransaction(transactions, "TEST");

        printUnSortedGroceryTransactions(transactions);
        printSortedGroceryTransactions(transactions);
        parallelStreams(transactions);
        streamHashMap();
    }

    private static void findTransaction(List<Transaction> transactions, String type){
        Optional<Transaction> transact = transactions.stream()
                .filter(t -> t.getType() == type).findAny();
        transact.ifPresent(t ->  System.out.println("Found: " + t.toString()));

        if(!transact.isPresent()) {
            System.out.println("Could not find transaction of type: " + type);
        }
    }
    private static void printSortedGroceryTransactions(List<Transaction> transactions){
        List<Transaction> groceryTransactions = transactions.stream()
                                                    .filter(t -> t.getType().equals(Transaction.GROCERY))
                                                    .sorted(comparing(Transaction::getValue))
                                                    .collect(Collectors.toList());

        System.out.println("----------Sorted Grocery Transactions----------");
        for(Transaction transaction : groceryTransactions){
            System.out.println(transaction.toString());
        }
    }

    private static void parallelStreams(List<Transaction> transactions){
        List<Integer> transactionsIds =
                transactions.parallelStream()
                        .filter(t -> t.getType() == Transaction.GROCERY)
                        .sorted(comparing(t -> t.getId()))
                        .map(Transaction::getId)
                        .collect(Collectors.toList());

        System.out.println("----------parallel Streams----------");
        for(int id : transactionsIds){
            System.out.println(id);
        }
    }

    private static void printUnSortedGroceryTransactions(List<Transaction> transactions){
        List<Transaction> groceryTransactions = transactions.stream()
                .filter(t -> t.getType().equals(Transaction.GROCERY))
                .collect(Collectors.toList());
        System.out.println("----------UnSorted Grocery Transactions----------");
        for(Transaction transaction : groceryTransactions){
            System.out.println(transaction.toString());
        }
    }

    private static void streamHashMap(){
        Map<Integer, String> HOSTING = new HashMap<>();
        HOSTING.put(1, "linode.com");
        HOSTING.put(2, "heroku.com");
        HOSTING.put(3, "digitalocean.com");
        HOSTING.put(4, "aws.amazon.com");

        //Map -> Stream -> Filter -> Map
        System.out.println("----------Stream API HashMap----------");
        Map<Integer, String> collect = HOSTING.entrySet().stream()
                .filter(map -> map.getKey() == 4)
                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));

        System.out.println(collect); //output : {4=aws.amazon.com}

        String result = HOSTING.entrySet().stream()
                .map(map -> map.getValue())
                .collect(Collectors.joining(","));

        System.out.println("With Java 8 : " + result);
    }
}
