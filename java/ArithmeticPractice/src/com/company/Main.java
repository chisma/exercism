package com.company;

import java.util.Random;

public class Main {


    public static void main(String[] args) {
        // write your code here
        Random randomInt = new Random(System.currentTimeMillis());
        System.out.println(randomInt.nextInt(1000000));
        System.out.println(randomInt.nextInt());
        System.out.println(randomInt.nextInt());
        System.out.println(randomInt.nextInt());
        System.out.println(randomInt.nextInt());
        System.out.println(randomInt.nextInt());
        System.out.println(randomInt.nextInt());


        if (randomInt.nextInt(10) < 5) {
            System.out.println("First If");
        }
        if (randomInt.nextInt(10) < 4) {
            System.out.println("Second If");
        }
        if (randomInt.nextInt(10) < 3) {
            System.out.println("Third If");

        }
    }
}
