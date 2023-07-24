package org.core_java.basic_data_structure;

import java.util.Scanner;

public class SimpleAndCompoundIntrest {
    // Find out simple as well as compound interest for the suppllied value
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the principal amount: ");
            double principal = scanner.nextDouble();

            System.out.print("Enter the interest rate (as a decimal): ");
            double interestRate = scanner.nextDouble();

            System.out.print("Enter the time period (in years): ");
            double time = scanner.nextDouble();

            // Calculating Simple Interest
            double simpleInterest = (principal * interestRate * time);

            // Calculating Compound Interest
            double compoundInterest = principal * (Math.pow((1 + interestRate), time) - 1);

            System.out.println("Simple Interest: " + simpleInterest);
            System.out.println("Compound Interest: " + compoundInterest);
    }
}
