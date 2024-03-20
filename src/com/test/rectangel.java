package com.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class rectangel {
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

class circle {
    public static void main(String[] args) {
        int radius = 5;
        double phi = Math.PI;
        double circumference = 31.4159;

        int diameter = radius * 2;
        System.out.println("the result of diamater is " + diameter);

        circumference = 2 * phi * radius;
        System.out.println("the result of circumference is " + circumference);

        double area = phi * radius * radius;
        System.out.println("the result of area is " + area);
    }
}

class triangle {
    public static void main(String[] args) {
        int a = 80;
        int b = 65;
        int output;

        output = 180 - a - b;
        System.out.println("the result angels of triangle is " + output);

    }
}

class date {
    public static void main(String[] args) {
        // LocalDate date1 = LocalDate.of(2024, 03, 19);
        // LocalDate date2 = LocalDate.of(2024, 03, 21);

        // int output = date1.until(date2).getDays();

        // System.out.printf("result date is " + output);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Start Date :");
        String startDate = scanner.nextLine();
        System.out.println("End Date :");
        String endDate = scanner.nextLine();
        scanner.close();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate parsedStartDate = LocalDate.parse(startDate, formatter);
        LocalDate parsedEndDate = LocalDate.parse(endDate, formatter);

        long daysDifference = ChronoUnit.DAYS.between(parsedStartDate, parsedEndDate);
        System.out.println("Days difference start and end is " + daysDifference + ", Days");

    }
}

class name {
    public static void main(String[] args) {
        String input = "John Wick";
        String[] output = input.split(" ");

        StringBuilder combine = new StringBuilder();
        for (String newOutput : output) {
            combine.append(newOutput.charAt(0));
        }
        System.out.println("the Initialize is " + combine);
    }
}

class testCommit {

}