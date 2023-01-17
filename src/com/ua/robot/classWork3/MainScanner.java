package com.ua.robot.classWork3;

import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string:");
        int fromInput = scanner.nextInt();
        System.out.println("Your input: " + fromInput);
    }
}
