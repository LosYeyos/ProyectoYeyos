package com.moviles.utils;

public class Intervalo<T extends Number> {
    private T min;
    private T max;

    public Intervalo(T min, T max) {
        this.min = min;
        this.max = max;
    }

    public T getMin() {
        return min;
    }

    public T getMax() {
        return max;
    }
}
