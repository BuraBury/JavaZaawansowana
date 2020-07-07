package com.burabury.generycznosc.kolekcje.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Exercise1 {

    static class SetElement {

        private String content;

        public SetElement(String content) {
            this.content = content;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            SetElement that = (SetElement) o;
            return Objects.equals(content, that.content);
        }

        @Override
        public int hashCode() {
            return Objects.hash(content);
        }
    }

    public static void main(String[] args) {
        SetElement object1 = new SetElement("pierwszy");
        SetElement object2 = new SetElement("pierwszy");
        SetElement object3 = new SetElement("pierwszy");
        SetElement object4 = new SetElement("pierwszy");
        SetElement object5 = new SetElement("pierwszy");
        SetElement object6 = new SetElement("pierwszy");

        Set<SetElement> elements = new HashSet<>();
        elements.add(object1);
        elements.add(object2);
        elements.add(object3);
        elements.add(object4);
        elements.add(object5);
        elements.add(object6);

        System.out.println(elements.size());
        System.out.println(elements.contains(object2));

        System.out.println(object1.equals(object2));

        SetElement setElement = elements.stream().findFirst().get();
        System.out.println(object1 == setElement);
        System.out.println(object6 == setElement);


    }


}
