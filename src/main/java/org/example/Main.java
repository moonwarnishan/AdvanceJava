package org.example;

import org.example.exceptions.Account;
import org.example.exceptions.ExceptionsDemo;

public class Main {
    public static void main(String[] args) {

        //ExceptionsDemo.show();
        var account = new Account();
        try {
            account.deposit(-1F);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}