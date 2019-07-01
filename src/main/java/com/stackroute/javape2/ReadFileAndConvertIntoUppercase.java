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
            File f = new File("/home/shubhi/Desktop/HelloWorld.txt");
            Path path = Paths.get("/home/shubhi/Desktop/HelloWorld.txt");
            byte[] data = readAllBytes(path);
            String text = new String(data);
            output = "length of file is " + f.length() + "\nThe content of file in uppercase is: " + text.toUpperCase();
            return output;
        }
    }