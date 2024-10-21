package org.example;

import org.example.generics.Uitls;

import java.io.IOException;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

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

//        var items = new GenericList<Integer>();
//        items.add(1);
//        int x = items.get(0);
//        System.out.println(x);

//        var uitls = new Uitls(1,"hello");
//        uitls.printKeyValues();
//        var list = List.of(1,2,3,4,5,6);
//        list.forEach(System.out::println);

        //List<String> stringList = List.of("a","b","c","d","e","f");
//        BinaryOperator<Integer> add = (a,b)->a+b;
//        Function<Integer,Integer> square = a->a*a;
//        var result = add.andThen(square).apply(1,2);
//        System.out.println(result);

        UnaryOperator<Integer> square = n->n*n;
        UnaryOperator<Integer> increment = n->n+1;
        var result = increment.andThen(square).apply(2);
        System.out.println(result);

    }
}