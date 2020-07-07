package com.burabury.generic.insideClass;

public class PrivateInterface {

    private interface TajemnicaOKtorejWszyscyWiedza {

        default void tajemnica() {
            System.out.println(tajemnicaPoliszynela());
        }

        private String tajemnicaPoliszynela() {
            return "tajemnicaPoliszynela";
        }

        class zaufanyCzlowiek implements TajemnicaOKtorejWszyscyWiedza {
            public static void main(String[] args) {
                zaufanyCzlowiek zaufanyCzlowiek = new zaufanyCzlowiek();
                zaufanyCzlowiek.tajemnica();

            }
        }
    }
}
