package com.stackroute;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFile {

        public String contentRead(File file) throws Exception {

            BufferedReader br = new BufferedReader(new FileReader(file));

            String input;

            while ((input = br.readLine()) != null) {

                String readFile = input.toUpperCase();
                System.out.println(readFile);

            }

            return "completed";

        }
    }

