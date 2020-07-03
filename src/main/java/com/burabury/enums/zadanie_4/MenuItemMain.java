package com.burabury.enums.zadanie_4;


public class MenuItemMain {
    public static void main(String[] args) {

        for (int i = 0; i < MenuItems.values().length; i++) {
            System.out.println(MenuItems.values()[i] + ": ");
            for (int j = 0; j < Language.values().length; j++) {
                System.out.println("\t" + Language.values()[j] + ": " + MenuItems.values()[i].translate(Language.values()[j]));
            }
            System.out.println();
        }

        try {
            System.out.println(MenuItems.values()[4].translate(Language.ENG));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }


    }
}
