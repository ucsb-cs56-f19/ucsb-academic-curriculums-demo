package edu.ucsb.cs56.demo;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import edu.ucsb.cs56.ucsbapi.academics.curriculums.v1.classes.CoursePage;

public class Main01 {

    public static final String filename="data/fall2019_cmpsc.json";

    /**
     * Try to read from data/fall2019_cmpsc.json
     */
    public static void main (String [] args) throws Exception {
        System.out.println("Trying to read from" + filename);

        String contents = new String(
            Files.readAllBytes(Paths.get(filename)),
            StandardCharsets.UTF_8
        ); 
        
        System.out.println("read " + contents.length() + " from " + filename);

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        CoursePage coursePage = objectMapper.readValue(contents, CoursePage.class);

        System.out.println("coursePage=" + coursePage);
    }

}