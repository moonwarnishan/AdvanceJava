package org.example.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    public static void show()
    {
        FileReader reader = null;
        try
        {
            new SimpleDateFormat().parse("");
             reader = new FileReader("file.txt");
            System.out.println("File Opened");
        }
        catch (FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
        catch (IOException | ParseException e)
        {
            System.out.println("Could not read data.");
        }
        finally {
            if(reader !=null)
            {
                try {
                    reader.close();
                    System.out.println("Hello this is finally");
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
        //sayHello(null);
    }
    public static void sayHello(String name)
    {
        System.out.println(name.toUpperCase());
    }
}
