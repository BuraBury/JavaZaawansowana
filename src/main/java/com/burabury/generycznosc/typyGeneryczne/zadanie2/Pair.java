package com.burabury.generycznosc.typyGeneryczne.zadanie2;

class Pair<T, R> {

    private final T first;
    private final R second;

    public Pair(T first, R second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public R getSecond() {
        return second;
    }
}
