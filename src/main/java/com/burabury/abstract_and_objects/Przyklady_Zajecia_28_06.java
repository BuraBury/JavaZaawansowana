package com.burabury.abstract_and_objects;

import java.util.Objects;

public class Przyklady_Zajecia_28_06 {

    public static void main(String[] args) {

        Object object = new Object();
        Object object1 = new Object();
        Object object2 = "Przykladowy tekst";

        NewClass newClass = new NewClass("abc");
        NewClass newClass1 = new NewClass("abc");

        Object newClass2 = new NewClass("ddd");

        ((NewClass) newClass2).fun();

        System.out.println(newClass.equals(newClass1));
        System.out.println(newClass.equals(object));

        newClass.fun();

        System.out.println(object2.toString());

//
//        System.out.println(object2.getClass());
//        System.out.println(object2.toString());
//        System.out.println(object2.hashCode());
//        System.out.println(object2.equals(object1));

    }


    //------------------------------------------------------------------------------------------

    static class NewClass {

        private String field;

        public NewClass(String field) {
            this.field = field;
        }

        private void fun() {
            System.out.println("fun fun fun");
        }
//
//        @Override
//        public boolean equals(Object o) {
//            if(o.getClass().getSimpleName().equals(NewClass.class.getSimpleName())) {
//                NewClass obiekt = (NewClass) o;
//                return field.equals(obiekt.field);
//            }
//
//            if (o instanceof NewClass) {
//                NewClass obiekt = (NewClass) o;
//                return field.equals(obiekt.field);
//            }
//
//            return false;
//        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            NewClass newClass = (NewClass) o;
            return Objects.equals(field, newClass.field);
        }

        @Override
        public int hashCode() {
            return Objects.hash(field);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
