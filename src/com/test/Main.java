package com.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int length, width, output;

        Scanner InputData = new Scanner(System.in);
        System.out.print("type the length = ");
        length = InputData.nextInt();

        System.out.print("type the width = ");
        width = InputData.nextInt();
        InputData.close();

        output = (length * width);
        System.out.println("the result of rectangel = " + output);

    }
}
