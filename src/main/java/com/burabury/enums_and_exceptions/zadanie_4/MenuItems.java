package com.burabury.enums_and_exceptions.zadanie_4;

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
                    case PL: return "PL: Produkty";
                    case DE: return "DE: Produkte";
                    case ENG: return "ENG: Products";
                }
                break;
            case BLOG:
                switch (language) {
                    case PL:
                    case DE:
                    case ENG:
                        return "blog";
                }
                break;
            case CONTACT:
                switch (language) {
                    case PL: return "PL: Kontakt";
                    case DE: return "DE: Kontakt";
                    case ENG: return "ENG: Contact";
                }
                break;
            case SITE_MAP:
                switch (language) {
                    case PL: return "PL: Mapa strony";
                    case DE: return "DE: Sitemap";
                    case ENG: return " ENG: Site map";

                }
        }
        return "Something goes wrong";
    }


}
