package com.burabury.generycznosc.kolekcje.queue;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Exercise1 {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();

        queue.offer("pierwszy");
        queue.offer("drugi");
        queue.offer("trzeci");
        queue.offer("czwarty");
        queue.offer("piaty");

        System.out.println(queue);
        System.out.println();
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println();
        System.out.println(queue.remove());
        queue.clear();
        System.out.println(queue);
        try {
            System.out.println(queue.remove());

        } catch (NoSuchElementException e) {
            System.out.println("kolejka jest pusta");
        }

    }
}
