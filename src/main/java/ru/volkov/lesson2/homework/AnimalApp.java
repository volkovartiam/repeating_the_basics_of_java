package ru.volkov.lesson2.homework;

public class AnimalApp {

    public static void main(String[] args) {

        Bird straus = new Bird("Страус", FlyStatus.NO_FLY.getStatus());

        Bird pingvin = new Bird("Пингвин", FlyStatus.NO_FLY.getStatus());
        pingvin.setPlumage(new Plumage("черный") );

        Bird kanareika = new Bird("Канарейка", FlyStatus.FLY.getStatus());
        kanareika.setPlumage(new Plumage("желтый") );
        kanareika.setSing(true);

        Bird drozd = new Bird("Дрозд", FlyStatus.FLY.getStatus());
        drozd.setPlumage(new Plumage("коричневый") );


        System.out.println(straus);
        System.out.println(pingvin);
        System.out.println(kanareika);
        System.out.println(drozd);
    }
}
