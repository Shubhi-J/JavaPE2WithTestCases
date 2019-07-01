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
            File file = new File("/home/shubhi/Desktop");
            File[] files = file.listFiles();
            for(File f: files){
                output=output+f.getName()+" ";
            }
          Path path = Paths.get("/home/shubhi/Desktop/HelloWorld.txt");
          byte[] data = readAllBytes(path);
           // return output.trim()+" "+data.toString();
          return output.trim()+"\n"+new String(data).trim();
        }
    }
