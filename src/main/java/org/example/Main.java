package org.example;

import org.example.basiceclasses.Genre;
import org.example.basiceclasses.Movie;
import org.example.generics.Uitls;
import org.example.threaddemo.ThreadDemo;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

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

        //lambda ----- expression
//        List<String> stringList = List.of("a","b","c","d","e","f");
//        BinaryOperator<Integer> add = (a,b)->a+b;
//        Function<Integer,Integer> square = a->a*a;
//        var result = add.andThen(square).apply(1,2);
//        System.out.println(result);

//        UnaryOperator<Integer> square = n->n*n;
//        UnaryOperator<Integer> increment = n->n+1;
//        var result = increment.andThen(square).apply(2);
//        System.out.println(result);

        //Stream -----
        var movies = List.of(new Movie("a",5, Genre.ACTION),
                new Movie("b",10,Genre.COMEDY),
                new Movie("c",12,Genre.COMEDY),
                new Movie("d",7,Genre.COMEDY),
                new Movie("d",7,Genre.THRILLER),
                new Movie("e",17,Genre.THRILLER));
//        //Imperative Programming
//        int count = 0;
//        for(var movie : movies)
//        {
//            if(movie.getLikes()>10)
//            {
//                count++;
//            }
//        }
//
//
//        var count2 = movies.stream().filter(x->x.getLikes()>10).count();

//        Stream.iterate(1,n->n+1)
//                .limit(10)
//                .forEach(System.out :: println);

//    movies.stream()
//            .map(Movie::getName)
//            .distinct()
//            .forEach(System.out::println);

//        movies.stream()
//                .filter(x->x.getLikes()>11)
//                .peek(System.out::println)
//                .map(Movie::getName)
//                .distinct()
//                .peek(System.out::println)
//                .forEach(System.out::println);

//        var result = movies.stream()
//                .collect(Collectors.groupingBy(Movie::getGenre),
//                                                Collectors.mapping(Movie::getName,Collectors.joining(", ")));
//        System.out.println(Optional.ofNullable(result));

//        //process and thread
//        System.out.println(Thread.activeCount());
//        System.out.println(Runtime.getRuntime().availableProcessors());

        ThreadDemo.show();
    }
}