package com.stackroute;

public class RemoveVowels {

    public String[] vowelRemoval(String[] input) {

        if (input == null)
            return null;

        String[] output = new String[input.length];

        for (int i=0; i<input.length; i++){
            output[i] = input[i].replaceAll("[aeiou]", "");

        }
        for( int i=0; i<output.length; i++) {
            System.out.println("Place Name without Vowels:" + i + " " + output[i]);
        }

        return output;
    }
}



