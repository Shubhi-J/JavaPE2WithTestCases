package com.stackroute.javape2;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.Files.readAllBytes;

public class ReadFileAndCalcuateFrequency {
    public String CalculateFrequency() throws IOException {
        String keyy="";
        String output="";
        Path path = Paths.get("/home/shubhi/Desktop/HelloWorld.txt");
        byte[] data = readAllBytes(path);
        String text = new String(data);
        String[] keys = text.split(" |\\.|!|\n+");
        String[] uniqueKeys;
        int count = 0;
        //System.out.println(text);
        uniqueKeys = getUniqueKeys(keys);

        for (String key : uniqueKeys) {
            if (null == key) {
                break;
            }
            for (String s : keys) {
                if (key.equals(s)) {
                   keyy=key;
                    count++;
                }
            }
            output=output+"Count of [" + key + "] is : " + count+"\n";
            count = 0;
        }
        return output.trim();
    }


    private static String[] getUniqueKeys(String[] keys)
    {
        String[] uniqueKeys = new String[keys.length];

        uniqueKeys[0] = keys[0];
        int uniqueKeyIndex = 1;
        boolean keyAlreadyExists = false;

        for(int i=1; i<keys.length ; i++)
        {
            for(int j=0; j<=uniqueKeyIndex; j++)
            {
                if(keys[i].equals(uniqueKeys[j]))
                {
                    keyAlreadyExists = true;
                }
            }

            if(!keyAlreadyExists)
            {
                uniqueKeys[uniqueKeyIndex] = keys[i];
                uniqueKeyIndex++;
            }
            keyAlreadyExists = false;
        }
        return uniqueKeys;
    }
}
