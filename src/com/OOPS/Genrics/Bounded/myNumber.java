package com.OOPS.Genrics.Bounded;

public class myNumber extends Number implements printable{
    private final int value;

    public myNumber(int value) {
        this.value = value;
    }

    @Override
    public void print() {

    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }


    class Boxx<T extends Number & printable>{

    }
}
