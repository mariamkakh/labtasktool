package com.java.automation.lab.fall.khamnava.core22.util;

import com.java.automation.lab.fall.khamnava.core22.exception.InvalidPathException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtil {
    public static String read(String path) throws InvalidPathException {
        File tmp = new File(path);
        if (!tmp.exists()) {
            throw new InvalidPathException();
        }
        StringBuffer res = new StringBuffer();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(path));
            String line = reader.readLine();
            while (line != null) {
                res.append('\n' + line);
                // read next line
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
       return res.toString();
    }

    public static void write(String path, String str) throws InvalidPathException {
        File tmp = new File(path);
        if (!tmp.exists()) {
            throw new InvalidPathException();
        }
        try {
            Files.writeString(Path.of(path), str);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }
}
