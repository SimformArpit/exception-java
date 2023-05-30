package com.simform;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int a = 100, b = 0, c;
            c = a / b;
            System.out.println("Try block will be executed successfully if no exception : " + c);
        } catch (ArithmeticException e) {
            System.out.println("If it find any Exception in try block this catch block will execute ");
            System.out.println("Exception class Name and Description : " + e);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("This finally block will be execute with or without error.");
        }
        System.out.println("After executing try catch block ");
    }
}
