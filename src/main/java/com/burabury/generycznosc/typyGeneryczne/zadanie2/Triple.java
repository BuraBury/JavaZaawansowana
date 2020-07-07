package com.burabury.generycznosc.typyGeneryczne.zadanie2;

class Triple<T, R, S> {
    private final T first;
    private final R second;
    private final S third;

    public Triple(T first, R second, S third) {
        this.first = first;
        this.second = second;
        this. third = third;
    }

    public T getFirst() {
        return first;
    }

    public R getSecond() {
        return second;
    }

    public S getThird() {
        return third;
    }
}
