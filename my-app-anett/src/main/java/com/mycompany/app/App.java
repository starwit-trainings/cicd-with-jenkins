package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        DemoFileReader fileReader = new DemoFileReader();
        WelcomeDto welcome = fileReader.readFile("/welcome.json");
        System.out.println(welcome.getMessage() + " " + welcome.getName());
    }
}
