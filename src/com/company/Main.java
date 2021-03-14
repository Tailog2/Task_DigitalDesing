package com.company;

public class Main {

    public static ProcessorLine processor = new ProcessorLine();

    public static void main(String[] args) {
        String input = "2[3[x]y]";
        String output = processor.processLine(input);
        System.out.println(output );

    }
}