package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        JsonFileReader fileReader = new JsonFileReader();
        JsonDto hello = fileReader.readJsonFile("/test.json");
        System.out.println(hello.getMessage() + " " + hello.getName());
    }
}
