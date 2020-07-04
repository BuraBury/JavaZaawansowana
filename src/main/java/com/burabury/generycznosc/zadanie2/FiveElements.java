package com.burabury.generycznosc.zadanie2;

class FiveElements<FIRST_TYPE, SECOND_TYPE, THIRD_TYPE, FOURTH_TYPE, FIFTH_TYPE> {

    private final Pair<FIRST_TYPE, SECOND_TYPE> pair;
    private final Triple<THIRD_TYPE, FOURTH_TYPE, FIFTH_TYPE> triple;

    public FiveElements(Pair<FIRST_TYPE, SECOND_TYPE> pair, Triple<THIRD_TYPE, FOURTH_TYPE, FIFTH_TYPE> triple) {
        this.pair = pair;
        this.triple = triple;
    }

    public FIRST_TYPE getFirst() {
        return pair.getFirst();
    }
    public SECOND_TYPE getSecond() {
        return pair.getSecond();
    }

}
