package com.burabury.enums.zadanie_2;

public enum StringOperation {

    REVERSE {
        @Override
        String of(String origin) {
            StringBuilder a = new StringBuilder();
            return a.append(origin).reverse().toString();
        }
    },
    TO_LOWER {
        @Override
        String of(String origin) {
            return origin.toLowerCase();
        }
    },
    TO_UPPER {
        @Override
        String of(String origin) {
            return origin.toUpperCase();
        }
    },
    UPPER_FIRST {
        @Override
        String of(String origin) {
            String a = origin.substring(0, 1);
            a = a.toUpperCase();
            return a + origin.substring(1).toLowerCase();
        }
    };

    abstract String of(String origin);


}
