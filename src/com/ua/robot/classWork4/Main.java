package com.ua.robot.classWork4;

import javax.lang.model.util.Elements;
import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args) {
        String str = "Hello world";

        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        String lowerCase = str.toLowerCase();
        String upperCase = str.toUpperCase();

        System.out.println(str.charAt(6));

        int length = str.length();
        int lastIndex = length - 2;

        System.out.println(str.charAt(lastIndex));

        String s2 = "first" + "second";
        String s3 = "first" + 4;
        System.out.println(s3);

//        System.out.println(str.concat("llo"));

        System.out.println((str.substring(1)));
        System.out.println(str.substring(1, 6));

        System.out.println(str.toLowerCase().indexOf("h"));
        System.out.println(str.indexOf("l"));
        System.out.println(str.lastIndexOf("l"));

        String fullName = "john smitH";
        String correctFullName = "John Smith";

        System.out.println(str.split(" "));

        String ss1 = "Q";
        String ss2 = "q";

        System.out.println(5 == 5);
        System.out.println(ss1.equals(ss2));
        System.out.println(ss1 == ss2);

        ss2 = ss2.toUpperCase();
        System.out.println(ss1.equals(ss2));
        System.out.println(ss1 == ss2);

        String s4 = " eii jor   ";
        System.out.println();
        System.out.println(s4);
        System.out.println(s4.trim()); //обрізання лишніх пробілів


        }
    }


