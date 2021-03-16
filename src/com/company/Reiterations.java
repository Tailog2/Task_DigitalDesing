package com.company;


public class Reiterations {
    private char amountReiterations;
    private char symbol;

    // This method return the amount of iterations from the input string
    public int getReiterations(String input) {
        for (int i = 0; i < input.length(); i++){
            symbol = input.charAt(i);
            // Checking if it's the ending of number
            if (symbol == '['){
                break;
            }
            // Checking if the current symbol is digit
            else if (Character.isDigit(symbol)){
                amountReiterations += symbol;
            }
        }
        return Character.getNumericValue(amountReiterations);
    }
}
