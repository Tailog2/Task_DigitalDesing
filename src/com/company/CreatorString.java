package com.company;


public class CreatorString {

// This method receive part of the original string in brackets and return a repeated string
    public String createString(String input){
        Reiterations reiterations = new Reiterations();
        int amount = reiterations.getReiterations(input);
        Repeater repeater = new Repeater();
        String letters = repeater.getBracketsLetters(input);

        return repeater.repeatString(letters, amount);
    }
}
