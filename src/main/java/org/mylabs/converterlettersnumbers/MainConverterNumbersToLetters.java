package org.mylabs.converterlettersnumbers;

import java.util.Arrays;
import java.util.List;

/**
 *  Main class that generate Lettres from Numbers
 */
public class MainConverterNumbersToLetters {

    private final List<String> numberAsString = Arrays.asList(
            "zero",
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
            "nineteen");

    private final List<String> numberAsStringForTens = Arrays.asList(
            "twenty"
           ,"thirty"
           ,"forty"
           ,"fifty"
           ,"sixty"
           ,"seventy"
           ,"eighty"
           ,"ninety"
    );

    public String convert(String input) {
        int inputValue = Integer.parseInt(input);
        StringBuilder result = new StringBuilder();
        while(!input.isEmpty()){
            int pow = (int) Math.pow(10, input.length() - 1);
            int position = inputValue / pow;
            switch (pow){
                case 1000 :
                {
                    result.append(numberAsString.get(position));
                    result.append(" thousand");
                };break;
                case 100 : {
                    if (!result.isEmpty()) {
                        result.append(" ");
                    }
                    result.append(numberAsString.get(position));
                    result.append(" hundred");
                };break;
                case 10  : {
                    if (inputValue > 19) {
                        if (!result.isEmpty()) {
                            result.append(" ");
                        }
                        result.append(numberAsStringForTens.get(position - 2));
                        if (inputValue % pow > 0) {
                            result.append("-");
                        }
                    }else{
                        result.append(numberAsString.get(inputValue));
                        inputValue = 0;
                    }
                };break;
                default: result.append(numberAsString.get(inputValue));
            }
            inputValue = inputValue % pow;
            if(inputValue == 0){
                return result.toString();
            }
            input = input.substring(1);
        }
        return result.toString();
    }
}
