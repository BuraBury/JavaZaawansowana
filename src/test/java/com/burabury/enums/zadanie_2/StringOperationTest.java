package com.burabury.enums.zadanie_2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringOperationTest {

    @Test
    @DisplayName("should 'of();' method return String backwards")
    void shouldOfReturnRevertedTextForReverse() {
        //given
        String origin = "Abecadlo";
        String result = "oldacebA";
        StringOperation stringOperation = StringOperation.REVERSE;

        //when
        String ofMethodResult = stringOperation.of(origin);

        //then
        assertEquals(ofMethodResult, result);
    }

    @Test
    @DisplayName("should 'of()' method return all String Upper Case")
    void shouldOfReturnUpperCase() {
        //given
        String origin = "abecadlo";
        String result = "ABECADLO";
        StringOperation stringOperation = StringOperation.TO_UPPER;

        //when
        String ofMethodResult = stringOperation.of(origin);

        //then
        assertEquals(ofMethodResult, result);
    }

    @Test
    @DisplayName("should 'of();' method return String Lower Case")
    void shouldOfReturnLowerCase() {
        //given
        String origin = "ABECADLO";
        String result = "abecadlo";
        StringOperation stringOperation = StringOperation.TO_LOWER;

        //when
        String ofMethodResult = stringOperation.of(origin);

        //then
        assertEquals(ofMethodResult, result);
    }

    @Test
    @DisplayName("should 'of();' method return String's first letter UpperCase")
    void shouldOfReturnFirstLetterUpperCase() {
        //given
        String origin = "abeCadLo";
        String result = "Abecadlo";
        StringOperation stringOperation = StringOperation.UPPER_FIRST;

        //when
        String ofMethodResult = stringOperation.of(origin);

        //then
        assertEquals(ofMethodResult, result);
    }


}