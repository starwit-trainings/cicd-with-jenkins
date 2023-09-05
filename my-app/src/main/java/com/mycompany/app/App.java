package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       reader reader = new reader();
       testWelcome test = reader.readFile("/test.json");
       System.out.println( test.getMessage()+" Herr " + test.getName());
    }

}
