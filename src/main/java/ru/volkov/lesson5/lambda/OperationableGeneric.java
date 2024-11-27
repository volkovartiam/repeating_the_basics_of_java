package ru.volkov.lesson5.lambda;

@FunctionalInterface
public interface OperationableGeneric<T> {

    T calculate(T x, T y);
}
