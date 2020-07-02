package com.burabury.exceptions.imprezaAkademik;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertThrows;


@ExtendWith(MockitoExtension.class)
class ImprezaAkademikTest {

    @Mock
    private Random randomMock;

    private ImprezaAkademik imprezaAkademik;

    @BeforeEach
    void setUp() {
        imprezaAkademik = new ImprezaAkademik(randomMock);
    }

    @Test
    void shouldThrowUnexpectedExceptionWhenRandomReturnValueBetween0and5() {
        //given
        int drunkLevel = 0;
        Mockito.when(randomMock.nextInt(30)).thenReturn(3);

        //when
        assertThrows(UnexpectedSituationException.class,
                () -> {
                    imprezaAkademik.party(drunkLevel);
                });

        //then
    }


}