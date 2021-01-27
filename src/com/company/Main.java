package com.company;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
// Question number 1
    public static void main(String[] args) {
//        System.out.println("Can you give me five numbers?");
//        int[] numbers = {2,8,5,6,1 };
//        Arrays.sort(numbers);
//        int sum=0;
//        int product=1;
//
//         for (int i = 0; i <numbers.length; i++) {
//             sum = sum + numbers[i];
//             product = product * numbers[i];
//             System.out.println(numbers[i]);
//         }
//        System.out.println(sum);
//        System.out.println(product);
//        System.out.println(numbers[4]);
//        System.out.println(numbers[0]);

        // Question Number Two

        Map<String, String> carModel = new HashMap<>();
        carModel.put("RAV4", "Toyota");
        carModel.put("Volt", "Chevy");
        carModel.put("Model3", "Tesla");
        carModel.put("range rover", "Land Rover");

        System.out.println(carModel);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, What kind of car you are looking for?");
        String carName = scanner.next();

        if (carModel.containsKey(carName) ) {
            System.out.println("Yes we have some " );
        } else {
            System.out.println("Sorry, we are sold out of those!");
        }


    }
}
