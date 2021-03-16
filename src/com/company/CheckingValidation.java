package com.company;

// Checking validation
public class CheckingValidation {
private int length;

    // This method check each character in the string,
    // return true if each character is proper
    // return false if one of characters is inappropriate
    public boolean checkValidation(String input) {

        length = input.length();
        // Checking first characters
        if (!(Character.UnicodeBlock.of(input.charAt(0)).equals(Character.UnicodeBlock.BASIC_LATIN) || Character.isDigit(input.charAt(0))))
            return false;
        // Checking last characters
        if ((input.charAt(length - 1) == '[' || Character.isDigit(input.charAt(length - 1))))
            return false;

        for (int i = 1; i < length-1; i++) {
            char sCurrent = input.charAt(i);
            char sFollowing = input.charAt(i + 1);
            char sPrevious = input.charAt(i - 1);

            if (sCurrent == '[' && Character.isDigit(sPrevious) && checkBrackets_R(input, i))
                continue;
            else if (sCurrent == ']' && checkBrackets_L(input, i))
                continue;
            else if (Character.isDigit(sCurrent) && (sFollowing == '[' || Character.isDigit(sFollowing)))
                continue;
            else if (Character.UnicodeBlock.of(sCurrent).equals(Character.UnicodeBlock.BASIC_LATIN))
                continue;
            else
                return false;
        }
    return true;
    }

    // Checking if there is a left bracket matching the right bracket, checking from lift to right
    public boolean checkBrackets_R(String input,int indexOpeningBracket) {

        int counter = 1;
        int indexClosingBracket = indexOpeningBracket+1;
        while (counter > 0 && (length > indexClosingBracket)) {
            char symbol = input.charAt(indexClosingBracket);
            if (symbol == '[')
                counter++;
            else if (symbol == ']')
                counter--;
            indexClosingBracket++;
        }
        return counter <= 0;
    }

    // Checking if there is a right bracket matching the left bracket, checking from right to left
    public boolean checkBrackets_L(String input,int indexClosingBracket) {

        int counter = -1;
        int indexOpeningBracket = indexClosingBracket-1;
        while (counter < 0 && (0 < indexOpeningBracket)) {
            char symbol = input.charAt(indexOpeningBracket);
            if (symbol == '[')
                counter++;
            else if (symbol == ']')
                counter--;
            indexOpeningBracket--;
        }
        return counter >= 0;
    }
}