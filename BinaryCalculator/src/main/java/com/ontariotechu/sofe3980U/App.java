package com.ontariotechu.sofe3980U;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss");
        System.out.println("The current local time is: " + dateTimeFormatter.format(LocalDateTime.now()));

        Scanner scan = new Scanner(System.in);
        List<String> options = Arrays.asList("1", "2", "3", "4");

        while (true) {
            System.out.println("Select an Operation:");
            System.out.println("1. Add \n2. Or \n3. And \n4. Multiply \n5. Exit ");
            String reply = scan.next().toLowerCase();

            if (reply.equals("5"))
                break;
            else if (!options.contains(reply))
                continue;

            System.out.println("Enter the first number:");
            Binary binary1 = new Binary(scan.next());
            System.out.println("Enter the second number:");
            Binary binary2 = new Binary(scan.next());

            Binary result = switch (reply) {
                case "1" -> Binary.add(binary1, binary2);
                case "2" -> Binary.or(binary1, binary2);
                case "3" -> Binary.and(binary1, binary2);
                case "4" -> Binary.multiply(binary1, binary2);
                default -> throw new Exception("Invalid Input");
            };
            System.out.println("The result is: " + result.getValue());
        }
    }
}
