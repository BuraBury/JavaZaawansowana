package com.burabury.exceptions.imprezaAkademik;

public class ImprezaAkademik {

    public void party(int drunkLevel) throws HangoverException, UnexpectedSituationException {

        if (drunkLevel < 5) {
            throw new UnexpectedSituationException();
        } else if (drunkLevel <= 20) {
            throw new HangoverException();
        } else if (drunkLevel <= 30) {
            throw new LoosedKeyException();
        } else if (drunkLevel <= 40) {
            throw new LoosedWalletException();
        } else if (drunkLevel <= 50) {
            throw new BurningBabilonException();
        } else {
            throw new MarsMissionException();
        }

    }




}
