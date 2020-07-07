package com.burabury.obiektowosc.phone;

public class PhoneMain {

    public static void main(String[] args) {

        PhoneEqualsExample firstNumber = new PhoneEqualsExample("Paulinka", 444444);
        PhoneEqualsExample secondNumber = new PhoneEqualsExample("Jakub", 222222);
        PhoneEqualsExample thirdNumber = new PhoneEqualsExample("Paulina", 454444);
        PhoneHashCodeExample fourthNumber = new PhoneHashCodeExample("Paulina", 444444);
        PhoneHashCodeExample fifthNumber = new PhoneHashCodeExample("Paulina", 444444);
        PhoneContractExample sixNumber = new PhoneContractExample("Jakub", 222222);
        PhoneContractExample sevenNumber = new PhoneContractExample("Jakub", 222222);

        System.out.println(sixNumber.equals(sevenNumber));
        System.out.println(sixNumber.equals(fifthNumber));
        System.out.println(secondNumber.equals(sixNumber));


    }
}
