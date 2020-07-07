package com.burabury.generic.genericTypes.exercise2;

public class FiveElements<FIRST, SECOND, THIRD, FOURTH, FIFTH> {
    private final Pair<FIRST, SECOND> pair;
    private final Triple<THIRD, FOURTH, FIFTH> triple;

    public FiveElements(FIRST a, SECOND b, THIRD c, FOURTH d, FIFTH e) {
        this.pair = new Pair<>(a, b);
        this.triple = new Triple<>(c, d, e);
    }

    public FIRST getFirst() {
        return pair.getFirst();
    }

    public SECOND getSecond() {
        return pair.getSecond();
    }

    public THIRD getThird() {
        return triple.getFirst();
    }

    public FOURTH getFourth() {
        return triple.getSecond();
    }

    public FIFTH getFifth() {
        return triple.getThird();
    }
}
