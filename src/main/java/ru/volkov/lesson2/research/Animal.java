package ru.volkov.lesson2.research;

public enum Animal {
    CAT {
        public String makeNoise() { return "MEOW!"; }
    },
    DOG {
        public String makeNoise() { return "WOOF!"; }
    };
    public abstract String makeNoise();
}