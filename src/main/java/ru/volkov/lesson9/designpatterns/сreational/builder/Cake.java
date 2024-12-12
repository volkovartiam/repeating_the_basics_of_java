package ru.volkov.lesson9.designpatterns.сreational.builder;

public class Cake {
    private final double sugar;   //чашка
    private final double butter;  //чашка
    private final int eggs;
    private final int vanila;     //ложка
    private final double flour;   //чашка
    private final double bakingpowder; //ложка
    private final double milk;  //чашка
    private final int cherry;

    public Cake(double sugar, double butter, int eggs, int vanila, double flour, double bakingpowder, double milk, int cherry) {
        this.sugar = sugar;
        this.butter = butter;
        this.eggs = eggs;
        this.vanila = vanila;
        this.flour = flour;
        this.bakingpowder = bakingpowder;
        this.milk = milk;
        this.cherry = cherry;
    }

    public static class Builder {

        private double sugar;   //чашка
        private double butter;  //чашка
        private int eggs;
        private int vanila;     //ложка
        private double flour;   //чашка
        private double bakingpowder; //ложка
        private double milk;  //чашка
        private int cherry;

        //Методы «Строителя» для задания свойства
        public Builder sugar(double cup){this.sugar = cup; return this; }
        public Builder butter(double cup){this.butter = cup; return this; }
        public Builder eggs(int number){this.eggs = number; return this; }
        public Builder vanila(int spoon){this.vanila = spoon; return this; }
        public Builder flour(double cup){this.flour = cup; return this; }

        public Builder bakingpowder(double spoon){this.sugar = spoon; return this; }
        public Builder milk(double cup){this.milk = cup; return this; }
        public Builder cherry(int number){this.cherry = number; return this; }


        //Возвращается полностью готовый объект
        public Cake build() {
            return new Cake(this);
        }
    }

    //Закрытый конструктор для принудительного создания объекта посредством «Строителя»
    private Cake(Builder builder) {
        this.sugar = builder.sugar;
        this.butter = builder.butter;
        this.eggs = builder.eggs;
        this.vanila = builder.vanila;
        this.flour = builder.flour;
        this.bakingpowder = builder.bakingpowder;
        this.milk = builder.milk;
        this.cherry = builder.cherry;
    }

    @Override
    public String toString() {
        return "Cake{" + "sugar=" + sugar + ", butter=" + butter + ", eggs=" + eggs + ", vanila=" + vanila + ", flour=" + flour + ", bakingpowder=" + bakingpowder + ", milk=" + milk + ", cherry=" + cherry + '}';

    }

}
