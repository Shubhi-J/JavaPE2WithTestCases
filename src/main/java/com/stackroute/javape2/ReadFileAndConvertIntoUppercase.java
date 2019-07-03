package com.stackroute.javape2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.Files.readAllBytes;

public class ReadFileAndConvertIntoUppercase {

        public String CalculateFrequency() throws IOException {
            String keyy = "";
            String output = "";
            // give path of file to calculate length of file
            File f = new File("/home/shubhi/Desktop/HelloWorld.txt");
            // give path of file to be read
            Path path = Paths.get("/home/shubhi/Desktop/HelloWorld.txt");
            // convert file content to byte array
            byte[] data = readAllBytes(path);
            // convert byte array to string
            String text = new String(data);
            // return the length of file and content of file in uppercase
            output = "length of file is " + f.length() + "\nThe content of file in uppercase is: " + text.toUpperCase();
            return output;
        }
    }