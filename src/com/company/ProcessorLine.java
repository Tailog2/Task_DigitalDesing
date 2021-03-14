package com.company;

// Processing line without
public class ProcessorLine {

    public String processLine(String input) {
        boolean condition = true;
        String line = input;
        String newPartString;
        int i = 0;
        StringBuilder newLine = new StringBuilder(line);
        CreatorString creator = new CreatorString();
        Repeater repeater = new Repeater();
        int lengthLine= input.length();

        while (condition) {

            if (Character.isDigit(line.charAt(i))) {

                int j = repeater.getClosingBracket(line, line.indexOf("["));;
                newPartString = creator.createString(line.substring(i,j+1));
                newLine.replace(i, j+1, newPartString);
                line = newLine.toString();
                i = 0;
                lengthLine = line.length();
            }
            else{
                condition = (lengthLine-1 != i);
                i++;
            }
        }
        return line;
    }

    public static CreateStr makeString() {
        return new CreatorString();
    }
}

