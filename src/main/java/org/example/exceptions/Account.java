package org.example.exceptions;

import java.io.IOException;

public class Account
{
    public void deposit(Float value) throws IOException
    {
        if(value <=0)
        {
            throw new IOException();
        }
    }
}
