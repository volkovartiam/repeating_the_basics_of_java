package ru.volkov.lesson9.designpatterns.behavioral.strategy;

public class StrategyDemo {
    public static void main(String args[]) {

        // добавляем любую стратегию для выполнения сортировки
        int[] var = {1, 2, 3, 4, 5};
        Context ctx = new Context(new BubbleSort());
        ctx.arrange(var);

        // меняем стратегию без изменения класса «Context»
        ctx = new Context(new QuickSort());
        ctx.arrange(var);
    }
}
