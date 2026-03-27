package com.gla.Exception;

 class InvalidAgeCheckerException extends Exception{
    public InvalidAgeCheckerException(String msg) {
        super(msg);
    }
}
public class ExceptionHandlingPractice2 {
    static void ageChecker(int age) throws InvalidAgeCheckerException {
        if(age<18){
            throw new InvalidAgeCheckerException("Age is Invalid for Voting");
        }
        System.out.println("Valid age for Voting");
    }

    public static void main(String[] args) {
        try{
            ageChecker(18);
        } catch (InvalidAgeCheckerException e) {
            System.out.println(e);
        }
    }
}

