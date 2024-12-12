package ru.volkov.lesson9.designpatterns.behavioral.observer;

public class ObserverDemo {
    public static void main(String args[]) {

        Loan personalLoan = new Loan("Personal Loan", 12.5f, "Standard Charterd");
        personalLoan.registerObserver(new Newspaper());
        personalLoan.registerObserver(new Internet());
        personalLoan.setInterest(3.5f);

        System.out.println("-------------------");
        personalLoan.registerObserver( new Email());
        personalLoan.setInterest(10f);

    }
}
