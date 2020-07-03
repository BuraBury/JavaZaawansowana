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
    }

    @Test
    void shouldReturnEmptyResultWhenRandomReturnValueBetween5And20() throws HangoverException, UnexpectedSituationException {
        int drunkLevel = 0;
        Mockito.when(randomMock.nextInt(30)).thenReturn(20);
        imprezaAkademik.party(drunkLevel);
    }

    @Test
    void shouldReturnEmtyResultWhenRandomValueOver20AndDrunkLevelLoverThan10() throws HangoverException, UnexpectedSituationException {
        int drunkLevel = 8;
        Mockito.when(randomMock.nextInt(30)).thenReturn(23);
        imprezaAkademik.party(drunkLevel);
    }

    @Test
    void shouldThrowMarsMissionExceptionWhenDrunkLevelOver50AndRandomReturnValueOver20() throws HangoverException, UnexpectedSituationException {
        int drunkLevel = 55;
        Mockito.when(randomMock.nextInt(30)).thenReturn(23);
        assertThrows(MarsMissionException.class,
                () -> {
                    imprezaAkademik.party(drunkLevel);

                });
    }

    @Test
    void shouldThrowBurningBabilonExceptionWhenDrunkLevelOver40AndRandomReturnValueOver20() {
        int drunkLevel = 44;
        Mockito.when(randomMock.nextInt(30)).thenReturn(23);

        assertThrows(BurningBabilonException.class,
                () -> {
                    imprezaAkademik.party(drunkLevel);
                });
    }

    @Test
    void shouldThrowLoosedWalletExceptionWhenDrunkLevelOver30AndRandomReturnOver20() {
        int drunkLevel = 33;
        Mockito.when(randomMock.nextInt(30)).thenReturn(23);

        assertThrows(LoosedWalletException.class,
                () -> {
                    imprezaAkademik.party((drunkLevel));
                });
    }

    @Test
    void shouldThrowLoosedKeyExceptionWhenDrunkLevelOver20AndRandomReturnOver20() {
        int drunkLevel = 22;
        Mockito.when(randomMock.nextInt(30)).thenReturn(23);

        assertThrows(LoosedKeyException.class,
                () -> {
                    imprezaAkademik.party(drunkLevel);
                });
    }

    @Test
    void shouldThrowHangoverExceptionWhenDrunkLevelOver10AndRandomReturnOver20() {
        int drunkLevel = 11;
        Mockito.when(randomMock.nextInt(30)).thenReturn(23);

        assertThrows(HangoverException.class,
                () -> {
                    imprezaAkademik.party(drunkLevel);
                });
    }



}