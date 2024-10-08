package org.example.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo {
    public static void show()
    {
        try
        {
            var reader = new FileReader("file.txt");
            System.out.println("File Opened");
        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        }
        //sayHello(null);
    }
    public static void sayHello(String name)
    {
        System.out.println(name.toUpperCase());
    }
}
