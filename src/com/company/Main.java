package com.company;

public class Main {

static CheckingValidation validation = new CheckingValidation();
static ProcessorLine processor = new ProcessorLine();

    public static void main(String[] args) {

        String input = "3[xyz]4[xy]z";
        if (validation.checkValidation(input)){
            String output = processor.processLine(input);
            System.out.println(output);
        }
        else{
            System.out.println("Invalid input");
        }
    }
}