package com.learnJava.lamdasinaction.chap5;
import java.util.function.*;
import com.learnJava.lamdasinaction.chap4.Dish;

import java.util.*;
import java.util.stream.Stream;
import java.util.Comparator.*;

import static java.util.Comparator.comparing;

public class Main {
    static Trader raoul = new Trader("Raoul", "Cambridge");
    static Trader mario = new Trader("Mario", "Milan");
    static Trader alan = new Trader("Alan", "Cambridge");
    static Trader brian = new Trader("Brian", "Cambridge");

    static List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
    );

    public static void main(String[] args) {

        //find all transactions in 2011 & sort ascending order
        transactions.stream()
                .filter(x -> x.getYear() == 2011)
                .sorted(comparing(Transaction::getValue))
                .forEach(System.out::println);

        //Unique cities where traders work
        transactions.stream()
                .map(x -> x.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        //find all traders from Cambridge and sort them by name
        transactions.stream()
                .map(Transaction::getTrader)
                .filter(y -> y.getCity() == "Cambridge")
                .distinct()
                .sorted(comparing(Trader::getName))
                .forEach(System.out::println);

        //Return a string of all traders names alphabetically
        String names = transactions.stream()
                .map(x -> x.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (a,b) -> a.concat(b));

        //Are any traders based in Milan
        boolean milan = transactions.stream()
                .map(x -> x.getTrader())
                .anyMatch(y -> y.getCity() == "Milan");
        System.out.println("True or False there are traders from Milan: " + milan);

        //print all transaction values from cambridge
        transactions.stream()
                .filter(x -> x.getTrader().getCity() == "Cambridge")
                .map(Transaction::getValue)
                .sorted()
                .forEach(System.out::println);
    }
}
