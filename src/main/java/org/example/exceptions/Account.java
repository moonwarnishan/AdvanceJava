package org.example.exceptions;

public class Account
{
    public void deposit(Float value)
    {
        if(value <=0)
        {
            throw new IllegalArgumentException();
        }
    }
}
