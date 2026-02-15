package com.securebank;

public class Main {
    public static void main(String[] args){
        System.out.println("SecureBank v0.1");
        System.out.println("Java version: " + System.getProperty("java.version"));

        //Declare Variables with explicit types
        String bankName = "SecureBank";
        int totalAccounts = 0;
        double interestRate = 0.025;
        boolean isOpen = true;

        System.out.println(bankName + " is " + (isOpen ? "open" : "closed"));
        System.out.println("Interest rate: " + (interestRate * 100) + "%");

    }
}
