package com.bridgelabz;

import java.util.Scanner;

public class Strings {
    //Write a program to check two strings are equal or not.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  string 1");
        String name1 = sc.next();
        System.out.println("Enter string 2 ");
        String name2 = sc.next();



        if (name1.equals(name2)) {
            System.out.println("Two Strings are equal.");
        } else {
            System.out.println("Two Strings are not equal");
        }
    }
}
