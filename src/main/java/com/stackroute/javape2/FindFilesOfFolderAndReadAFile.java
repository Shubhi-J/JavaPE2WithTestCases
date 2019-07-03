package com.stackroute.javape2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.Files.readAllBytes;

public class FindFilesOfFolderAndReadAFile {

      public String getFilesFromFolder() throws IOException {
          String output="";
            // give path of folder
            File file = new File("/home/shubhi/Desktop");
            // find list of files
            File[] files = file.listFiles();
            // iterate over list of files
            for(File f: files){
                output=output+f.getName()+" ";
            }
          // give path of file
          Path path = Paths.get("/home/shubhi/Desktop/HelloWorld.txt");
          // read content of file as byte array
          byte[] data = readAllBytes(path);
          return output.trim()+"\n"+new String(data).trim();
        }
    }
