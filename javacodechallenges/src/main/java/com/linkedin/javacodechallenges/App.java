package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static boolean isPasswordComplex(String password) {
        if (password.length() < 6) {
            return false;
        }
        boolean hasUpper = false, hasLower = false, hasNumber = false;
        char[] pass = password.toCharArray();
        for (int i = 0; i < pass.length; i++) {
            int asciiVal = (int) pass[i];
            if (asciiVal >= 48 && asciiVal <= 57) {
                hasNumber = true;
            } else if (asciiVal >= 65 && asciiVal <= 90) {
                hasUpper = true;
            } else if (asciiVal >= 97 && asciiVal <= 122) {
                hasLower = true;
            }
        }
        return hasLower && hasUpper && hasNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? "
                + isPasswordComplex(userInput));

        scanner.close();
    }
}
