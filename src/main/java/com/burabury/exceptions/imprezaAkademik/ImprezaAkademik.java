package com.burabury.exceptions.imprezaAkademik;

import java.util.Random;

public class ImprezaAkademik {

    public void party(int drunkLevel) throws HangoverException, UnexpectedSituationException {

        Random random = new Random();
        drunkLevel = random.nextInt(55);

        if (drunkLevel > 0 && drunkLevel <= 5) {
            throw new UnexpectedSituationException();
        } else if (drunkLevel > 5 && drunkLevel <= 20) {
            return;
        }


        if (drunkLevel > 50) {
            throw new MarsMissionException();
        } else if (drunkLevel > 40) {
            throw new BurningBabilonException();
        } else if (drunkLevel > 30) {
            throw new LoosedWalletException();
        } else if (drunkLevel > 20) {
            throw new LoosedKeyException();
        } else if (drunkLevel > 10) {
            throw new HangoverException();
        }

    }


}
