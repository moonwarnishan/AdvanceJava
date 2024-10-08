package org.example;

import org.example.exceptions.Account;
import org.example.exceptions.ExceptionsDemo;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        //ExceptionsDemo.show();
        var account = new Account();
        try {
            account.deposit(-1F);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            throw e;
        }

    }
}