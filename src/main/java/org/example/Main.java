package org.example;

import org.example.exceptions.Account;
import org.example.exceptions.AccountException;
import org.example.exceptions.ExceptionsDemo;
import org.example.exceptions.InsufficientFundException;
import org.example.generics.GenericList;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        //ExceptionsDemo.show();
//        var account = new Account();
//        try {
//            account.deposit(-1F);
//        }
//        catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//            throw e;
//        }
//        var account = new Account();
//        try {
//            account.withdraw(1000);
//        } catch (InsufficientFundException e) {
//            e.printStackTrace();
//        }

//        var account = new Account();
//        try {
//            account.withdraw(1000);
//        } catch (AccountException e) {
//            e.printStackTrace();
//            throw new RuntimeException(e);
//        }

        var items = new GenericList<Integer>();
        items.add(1);
        int x = items.get(0);
        System.out.println(x);

    }
}