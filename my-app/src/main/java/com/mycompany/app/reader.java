package com.mycompany.app;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;

public class reader {

    public testWelcome readFile(String datName) {
        testWelcome welcome = new testWelcome();
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream is = this.getClass().getResourceAsStream(datName);
            welcome = mapper.readValue(is, testWelcome.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return welcome;
    }
}