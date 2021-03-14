package com.company;

class Repeater extends CreatorString {

    private String repeatedString;

    public String repeatString(String letters, int amount) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < amount; i++) {
            builder.append(letters);
        }

        repeatedString = builder.toString();
        return repeatedString;
    }

    public String getBracketsLetters(String input) {



        // Looking for an index of first bracket
        int indexOpeningBracket = input.indexOf("[");

        // Looking for an index of second bracket
        int getClosingBracket = getClosingBracket(input, indexOpeningBracket);

        // Pulling out a letters
        String letters = input.substring(indexOpeningBracket+1,getClosingBracket);

        return letters;
    }
    public int getClosingBracket (String input, int indexOpeningBracket) {

        // Looking for an index of second bracket
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
