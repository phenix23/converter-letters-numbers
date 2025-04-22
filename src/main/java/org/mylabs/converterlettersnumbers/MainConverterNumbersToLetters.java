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
            "Eleven",
            "Twelve",
            "Thirteen",
            "Fourteen",
            "Fifteen",
            "Sixteen",
            "Seventeen",
            "Eighteen",
            "Nineteen");

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
            double pow = Math.pow(10, input.length() - 1);
            int position = (int) (inputValue / pow);
            if( pow <= 10 ){
                if(inputValue > 19){
                    if(!result.isEmpty()){
                        result.append(" ");
                    }
                    result.append(numberAsStringForTens.get(position - 2));
                    if(inputValue % pow > 0){
                        result.append("-");
                    }
                }else{
                   return result.append(numberAsString.get(inputValue)).toString();
                }
            }else{
                result.append(numberAsString.get(position));
                result.append(" hundred");
            }
            inputValue = (int) (inputValue % pow);
            if(inputValue == 0){
                return result.toString();
            }
            input = input.substring(1);
        }
        return result.toString();
    }
}
