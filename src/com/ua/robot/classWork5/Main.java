package com.ua.robot.classWork5;

public class Main {
    public static void main(String[] args) {
        int number = -13;

        boolean evenOrGraterZero = number % 2 == 0 && number > 0;
        boolean notEqualThirteen = number != 13;
        if (evenOrGraterZero || notEqualThirteen) {
            System.out.println(number + " is even or > 0");
        } else {
            System.out.println("not equals");
        }

        int number2 = 3;
        double f1 = 1111111111111111.1d;
        String s1 = "dsd";
        String s2 = "frere";
        if (s1.equals(s2)) {
            System.out.println("eq");
        }
        //  System.out.println((long) f1);

        if (number2 == 1) {
            System.out.println("1");
        } else if (number2 == 2) {
            System.out.println("2");
        } else if (number2 == 3) {
            System.out.println("3");
        } else {
            System.out.println("else");
        }

        System.out.println();
        double d = 4.5d;

        switch (number2) {
            case 0:
                System.out.println("0");
                break;
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                System.out.println();
                //  number2 = 4;
                int a = 676;
                break;
            case 4:
                System.out.println("4");
                break;
            default:
                System.out.println("default");
                break;
        }

        String operator = "+"; // + - * /
        switch (operator) {
            case "+":
                int a = 6 + 7;
                break;
            case "-":
                int b = 6 - 7;
                break;
            default:
                break;
        }

        System.out.println();
        switch (number2) {
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            case 3 -> System.out.println("3");
            default -> System.out.println("defult");
        }

        double a = 5.0d;
        float l = 6.6f;
        var al = a + l;
        Integer q = new Integer(3);
        Integer w = new Integer(3);
        if (q.equals(w)) {

        }

    }
}
