package org.mylabs.converterlettersnumbers;

/**
 *  Main class that generate Lettres from Numbers
 */
public class MainConverterNumbersToLetters {

    private final String[] numberAsString = {
            "",
            "one" ,
            "two",
            "three",
            "four",
            "five" ,
            "six" ,
            "seven",
            "eight" ,
            "nine" ,
            "ten",
            "eleven",
            "twelve",
            "thirteen",
            "fourteen",
            "fifteen",
            "sixteen",
            "seventeen",
            "eighteen",
            "nineteen"
    };

    private final String[] numberAsStringForTens = {
            "twenty"
            , "thirty"
            , "forty"
            , "fifty"
            , "sixty"
            , "seventy"
            , "eighty"
            , "ninety"
    };

    public String convertNumbreToString(String input){
        long inputValue = Long.parseLong(input);
        if(inputValue < 0){
            throw new IllegalArgumentException("Input must be a positive integer.");
        }
        return (inputValue == 0) ?  "zero" : convert(inputValue);
    }

    public String convert(long inputValue) {
        if (inputValue < 20) {
            return numberAsString[Math.toIntExact(inputValue)];
        } else if (inputValue < 100) {
            return (inputValue % 10 == 0 ) ? numberAsStringForTens[Math.toIntExact((inputValue / 10) - 2)] : numberAsStringForTens[Math.toIntExact((inputValue / 10) - 2)] + "-" + numberAsString[Math.toIntExact(inputValue % 10)];
        } else if (inputValue < 1000) {
            return (inputValue % 100 == 0) ? numberAsString[Math.toIntExact(inputValue / 100)] + " hundred" : numberAsString[Math.toIntExact(inputValue / 100)] + " hundred " + convertNumbreToString(String.valueOf(inputValue % 100));
        } else if (inputValue < 1000000) {
            return (inputValue % 1000 == 0 ) ? convertNumbreToString(String.valueOf(inputValue / 1000)) + " thousand" :  convertNumbreToString(String.valueOf(inputValue / 1000)) + " thousand " + convertNumbreToString(String.valueOf(inputValue % 1000));
        } else if (inputValue < 1000000000) {
            return (inputValue % 1000000 == 0 ) ? convertNumbreToString(String.valueOf(inputValue / 1000000)) + " million" : convertNumbreToString(String.valueOf(inputValue / 1000000)) + " million " + convertNumbreToString(String.valueOf(inputValue % 1000000));
        } else {
            return (inputValue % 1000000000 == 0) ? convertNumbreToString(String.valueOf(inputValue / 1000000000)) + " billion" : convertNumbreToString(String.valueOf(inputValue / 1000000000)) + " billion " + convertNumbreToString(String.valueOf(inputValue % 1000000000));
        }
    }
}
