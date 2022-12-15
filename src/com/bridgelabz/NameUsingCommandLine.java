package com.bridgelabz;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NameUsingCommandLine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name =");
        String name = sc.nextLine();

        System.out.println("Hello " + name + " Welcome to java");
    }
}
