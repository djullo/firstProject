package com.ua.robot.classWork3;

public class Main {
    public static void main(String[] args) {
        int year = 30;
        int aftertenYears = 10;

        int future = year + aftertenYears;
        System.out.println(future);
        int a = 99;
        int b = -66;
        double d = 9.99;
        System.out.println(a - b);
        System.out.println(a + d);
        int c = (int) (a + d);
        System.out.println(c);
        System.out.println(a * b);
        System.out.println((double) a / (double) b);

        System.out.println(2232 % 3);

        int q = 1;
//        q = q + 1;
//        q += 1;
//        q++;
//        q--;//
//        q = q -1;
//        System.out.println(q++ + ++q);
        q /= 1;
        q *= 4;
        q %= 4;
    }
}
