package com.starwit.app;

import java.io.File;
import com.starwit.app.DemoFileReader;
import com.starwit.app.WelcomeDto;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        DemoFileReader fileReader = new DemoFileReader();
        WelcomeDto welcome = fileReader.readFile("welcome.json");
        System.out.println(welcome.getMessage() + " " + welcome.getName());

    }
}
