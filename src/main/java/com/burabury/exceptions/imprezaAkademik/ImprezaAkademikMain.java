package com.burabury.exceptions.imprezaAkademik;

import java.util.Random;

public class ImprezaAkademikMain {
    public static void main(String[] args) {

        for (int i = 0; i < 60; i += 2) {
            try {
                new ImprezaAkademik(new Random()).party(i);
            } catch (UnexpectedSituationException e) {
                System.out.println("Wydarzyło się coś nieoczekiwanego, nie miałeś na to wpływu");
            } catch (MarsMissionException e) {
                System.out.println("Chciałeś ruszyć z misją ratunkową za kolegami którzy wystartowali na marsa. To cud że jeszcze żyjesz!");
            } catch (LoosedKeyException e) {
                System.out.println("Zgubiłeś klucze");
            } catch (LoosedWalletException e) {
                System.out.println("Zgubiłeś portfel");
            } catch (BurningBabilonException e) {
                System.out.println("Gratulacje, teraz cały Kraków o was mówi, drogo zapłacisz za swoją głupotę");
            } catch (HangoverException e) {
                System.out.println("Los był dla ciebie łaskawy, skończyło się tylko kacem");
            }



        }
    }
}
