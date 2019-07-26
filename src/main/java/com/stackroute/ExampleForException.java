package com.stackroute;

public class ExampleForException {

    String message;

    public ExampleForException(String message){

        System.out.println(this.message = message);

    }

    public static void main(String[] args) throws Exception {

        ExampleForException exceptionExample = new ExampleForException("Throwing exception in try block");

        try{
            throw  new Exception(exceptionExample.message);
        }
        catch (Exception exp){
            System.out.println(exp.getMessage());
        }

        finally {
            System.out.println("I was there");
        }

    }
}
