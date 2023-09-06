package com.mycompany.app;

import java.io.File;
import java.io.InputStream;

import com.mycompany.app.WelcomeDto;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DemoFileReader {

    public WelcomeDto readFile(String datName) {
        WelcomeDto welcome = new WelcomeDto();
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream is = this.getClass().getResourceAsStream(datName);
            welcome = mapper.readValue(is, WelcomeDto.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return welcome;
    }
}
