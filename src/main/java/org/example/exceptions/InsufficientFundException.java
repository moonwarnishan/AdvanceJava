package org.example.exceptions;

public class InsufficientFundException extends Exception{
    public InsufficientFundException(String message)
    {
         super(message);
    }
    public InsufficientFundException()
    {
        super("Insufficient funds in your account.");
    }
}
