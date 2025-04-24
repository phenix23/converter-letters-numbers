package org.mylabs.converterlettersnumbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MainConverterNumbersToLettersTest {

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testConvert(String input, String expected) {
        MainConverterNumbersToLetters converter = new MainConverterNumbersToLetters();
        String result = converter.convertNumbreToString(input);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of("0", "zero"),
                Arguments.of("1", "one"),
                Arguments.of("19", "nineteen"),
                Arguments.of("20", "twenty"),
                Arguments.of("90", "ninety"),
                Arguments.of("21", "twenty-one"),
                Arguments.of("99", "ninety-nine"),
                Arguments.of("100", "one hundred"),
                Arguments.of("300", "three hundred"),
                Arguments.of("156", "one hundred fifty-six"),
                Arguments.of("1000", "one thousand"),
                Arguments.of("2343", "two thousand three hundred forty-three"),
                Arguments.of("10000", "ten thousand"),
                Arguments.of("100000", "one hundred thousand"),
                Arguments.of("3000000", "three million"),
                Arguments.of("9000000000", "nine billion"),
                Arguments.of("100000000000", "one hundred billion")
        );
    }

    @ParameterizedTest
    @MethodSource("provideConverterErrorTestCases")
    void testConverterThrowsNumberFormatException(String input) {
        MainConverterNumbersToLetters converter = new MainConverterNumbersToLetters();
        assertThrows(NumberFormatException.class,
                () -> converter.convertNumbreToString(input),
                "Expected converter() to throw NumberFormatException"
        );
    }

    private static Stream<Arguments> provideConverterErrorTestCases() {
        return Stream.of(
                Arguments.of(""),
                Arguments.of("AnyString")
        );
    }

    @ParameterizedTest
    @MethodSource("provideConverterErrorInputTestCases")
    void testConverterThrowsIllegalArgumentException(String input) {
        MainConverterNumbersToLetters converter = new MainConverterNumbersToLetters();
        assertThrows(IllegalArgumentException.class,
                () -> converter.convertNumbreToString(input),
                "Input must be a positive integer."
        );
    }

    private static Stream<Arguments> provideConverterErrorInputTestCases() {
        return Stream.of(
                Arguments.of("-333")
        );
    }

}