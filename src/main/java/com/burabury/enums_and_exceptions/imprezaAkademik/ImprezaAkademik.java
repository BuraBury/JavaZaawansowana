package com.burabury.enums_and_exceptions.imprezaAkademik;

import java.util.Random;

public class ImprezaAkademik {

    public void party(int drunkLevel) throws HangoverException {
        if (drunkLevel < 5) {
            throw new UnsupportedOperationException();
        } else if (drunkLevel < 10) {
        } else if (drunkLevel < 20) {
            throw new HangoverException();
        } else if (drunkLevel < 30) {
            throw new LoosedWalletException();
        } else if (drunkLevel < 40) {
            throw new LoosedKeyException();
        } else if (drunkLevel < 50) {
            throw new BurningBabilonException();
        } else if (drunkLevel > 50) {
            throw new MarsMissionException();
        }

    }

    public static void main(String[] args) {

        ImprezaAkademik impreza = new ImprezaAkademik();

//        Object imprezaObiektowa = new ImprezaAkademik();
//        ImprezaAkademik imprezka = (ImprezaAkademik) imprezaObiektowa;

        Random random = new Random();
        int drunkLevel = random.nextInt(55);

        try {
            impreza.party(drunkLevel);
            System.out.println("Fajna impreza, nie stało się nic złego");
        } catch (MarsMissionException e) {
            System.out.println("Chciałeś ruszyć z misją ratunkową za kolegami, którzy wystartowali na marsa. To cud że jeszcze żyjesz! ");
        } catch (BurningBabilonException e) {
            System.out.println("Gratulacje, teraz cały Kraków o was mówi, drogo zapłacisz za swoją głupotę");
        } catch (HangoverException e) {
            e.printStackTrace();
        }

    }

}
