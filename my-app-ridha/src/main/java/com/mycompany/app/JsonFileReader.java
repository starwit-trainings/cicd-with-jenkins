package com.mycompany.app;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;

public class JsonFileReader {

    public JsonDto readJsonFile(String datName) {
        JsonDto hello = new JsonDto();
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream is = this.getClass().getResourceAsStream(datName);
            hello = mapper.readValue(is, JsonDto.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hello;
    }
}
