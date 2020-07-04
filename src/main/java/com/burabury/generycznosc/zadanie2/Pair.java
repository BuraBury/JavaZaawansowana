package com.burabury.generycznosc.zadanie2;

class Pair<T, R> {

    private final T first;
    private final R second;

    public Pair(T pair, R pair2) {
        this.first = pair;
        this.second = pair2;
    }

    public T getFirst() {
        return first;
    }

    public R getSecond() {
        return second;
    }
}
