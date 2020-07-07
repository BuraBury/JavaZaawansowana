package com.burabury.generic.genericTypes.exercise1;

public class Chef<T extends Food> {

    protected void prepareMeal(T foodToPrepare) {
        foodToPrepare.prepare();
    }
}
