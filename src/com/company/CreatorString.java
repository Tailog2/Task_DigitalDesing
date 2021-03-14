package com.company;

public class CreatorString implements CreateStr {


    @Override
    public String createString(String input){
        String output = new String();
        Reiterations reiterations = new Reiterations();
        int amount = reiterations.getReiterations(input);
        Repeater repeater = new Repeater();
        String letters = repeater.getBracketsLetters(input);
        output = repeater.repeatString(letters, amount);

        return output;
    }
}
