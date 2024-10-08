package org.example.exceptions;

import java.io.IOException;

public class Account
{
    public float balance;
    public void deposit(Float value) throws IOException
    {
        if(value <=0)
        {
            throw new IOException();
        }
    }
    public void withdraw(float value) throws AccountException
    {
        if(value > balance)
        {
            //            throw new InsufficientFundException();
            var fundException = new InsufficientFundException();
            var accountException = new AccountException(fundException);
            accountException.initCause(fundException);
            throw accountException;
        }

    }
}
