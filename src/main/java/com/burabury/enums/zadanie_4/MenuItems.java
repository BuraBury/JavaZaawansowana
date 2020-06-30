package com.burabury.enums.zadanie_4;

public enum MenuItems implements Translatable {
    PRODUCTS,
    CONTACT,
    SITE_MAP,
    BLOG;

    @Override
    public String translate(Language language) {
        switch (this) {
            case PRODUCTS:
                switch (language) {
                    case PL:
                        return "Produkty";
                    case DE:
                        return "Produkte";
                    case ENG:
                        return "Products";
                }

            case BLOG:
                switch (language) {
                    case PL:
                    case DE:
                    case ENG:
                        return "blog";
                }

            case CONTACT:
                switch (language) {
                    case PL:
                    case DE:
                        return "Kontakt";
                    case ENG:
                        return "Contact";
                }

            case SITE_MAP:
                switch (language) {
                    case PL:
                        return "Mapa strony";
                    case DE:
                        return "Sitemap";
                    case ENG:
                        return "Site map";

                }
        }
        throw new IllegalArgumentException();
    }


}
