package com.burabury.klasyWewnetrzne;

public class Cringe {

    private int anInt = 5;

    class InnerCringe {
        private int anInt = 10;

        class InnerInnerCringe {
            private int anInt = 15;

            public void allTheX() {
                System.out.println(anInt);
                System.out.println(this.anInt);
                System.out.println(InnerCringe.this.anInt);
                System.out.println(Cringe.this.anInt);
            }
        }
    }

    public static void main(String[] args) {
        //new Cringe().new InnerCringe().newInnerInnerCringe().allX(); ---- skrocony zapis poniższego

        Cringe cringe = new Cringe();
        InnerCringe innerClass = cringe.new InnerCringe();
        InnerCringe.InnerInnerCringe innerInnerClar = innerClass.new InnerInnerCringe();
        innerInnerClar.allTheX(); //15 15 10 5


    }
}
