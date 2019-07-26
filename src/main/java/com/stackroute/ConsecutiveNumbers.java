package com.stackroute;

public class ConsecutiveNumbers {

    public String consecutiveNumbers(String input) {

        if (input == null)
            return null;

        String[] output = input.split("");

        int[] data = new int[output.length];
        boolean value=true;

        for (int i = 0; i < output.length; i++) {


            data[i] = Integer.parseInt(output[i]);
        }


        for (int i = 0; i < data.length; i++) {

            if (data[i + 1] - data[i] == 1 || data[i] - data[i + 1] == 1) {

            }
             value=false;

        }

        if(value)
            return "Numbers are Consecutive";

            else
               return "Numbers are Not Consecutive";
        }

    }

