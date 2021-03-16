package com.company;

// This class contains methods that implement reiteration for the class "CreatorString"
class Repeater {

    // This method receive the string and amount of reiterations then return the repeated string
    public String repeatString(String letters, int amount) {
        String repeatedString;
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < amount; i++) {
            builder.append(letters);
        }

        repeatedString = builder.toString();
        return repeatedString;
    }

    // This method receive the whole string and then return the part of string in brackets
    // This method is used to get a part of string in brackets
    // It's gets whole string and then looking for the opening bracket "[",
    // afterwards it use method getClosingBracket to get matching closing bracket "]"
    public String getBracketsLetters(String input) {

        // Looking for an index of first bracket
        int indexOpeningBracket = input.indexOf("[");
        // Looking for an index of second bracket
        int getClosingBracket = getClosingBracket(input, indexOpeningBracket);
        // Pulling out a letters

        return input.substring(indexOpeningBracket+1,getClosingBracket);
    }

    // This method receive the whole string and opening bracket "[" then return the matching closing bracket "]"
    // This method is used to find the matching closing bracket "]"
    public int getClosingBracket (String input, int indexOpeningBracket) {

        int counter = 1;
        int indexClosingBracket = indexOpeningBracket;
        while (counter > 0) {
            char symbol = input.charAt(indexClosingBracket+1);
            if (symbol == '[') {
                counter++;
            }
            else if (symbol == ']') {
                counter--;
            }
            indexClosingBracket++;
        }
        return indexClosingBracket;
        }
}
