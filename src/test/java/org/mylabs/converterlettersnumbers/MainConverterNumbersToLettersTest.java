package org.mylabs.converterlettersnumbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainConverterNumbersToLettersTest {

    MainConverterNumbersToLetters converter = new MainConverterNumbersToLetters();

    @Test
    void shouldInput0returnZero() {
        String input = "0";
        Assertions.assertEquals("zero", converter.convert(input));
    }

    @Test
    void shouldInput1returnOne() {
        String input = "1";
        Assertions.assertEquals("one", converter.convert(input));
    }

    @Test
    void shouldInput19returnNineteen() {
        String input = "19";
        Assertions.assertEquals("Nineteen", converter.convert(input));
    }

    @Test
    void shouldThrowAnExceptionWhenInputStringNotNumeric(){
        String input = "";
        Assertions.assertThrowsExactly(NumberFormatException.class, () -> converter.convert(input));
    }

    @Test
    void shouldInput20ReturnTwenty(){
        String input = "20";
        Assertions.assertEquals("twenty", converter.convert(input));
    }

    @Test
    void shouldInput90ReturnNinety(){
        String input = "90";
        Assertions.assertEquals("ninety", converter.convert(input));
    }

    @Test
    void shouldInput21ReturnTwentyOne(){
        String input = "21";
        Assertions.assertEquals("twenty-one", converter.convert(input));
    }

    @Test
    void shouldInput99ReturnNinetyNine(){
        String input = "99";
        Assertions.assertEquals("ninety-nine", converter.convert(input));
    }

    @Test
    void shouldInput100ReturnHundred(){
        String input = "100";
        Assertions.assertEquals("one hundred", converter.convert(input));
    }

    @Test
    void shouldInput300ReturnThreeHundred(){
        String input = "300";
        Assertions.assertEquals("three hundred", converter.convert(input));
    }

    @Test
    void shouldInput156ReturnOneHundredFiftySix(){
        String input = "156";
        Assertions.assertEquals("one hundred fifty-six", converter.convert(input));
    }

    @Test
    void shouldInput999ReturnNineHundredNinetyNine(){
        String input = "999";
        Assertions.assertEquals("nine hundred ninety-nine", converter.convert(input));
    }















}