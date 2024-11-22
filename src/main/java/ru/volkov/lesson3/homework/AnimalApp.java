package ru.volkov.lesson3.homework;

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

        Bird drozd_2 = new Bird("Дрозд", FlyStatus.FLY.getStatus());
        drozd_2.setPlumage(new Plumage("коричневый") );



        System.out.println(straus);
        System.out.println(pingvin);
        System.out.println(kanareika);
        System.out.println(drozd);
        System.out.println(drozd_2);


        System.out.println();
        System.out.println( drozd.equals(drozd_2));
        System.out.println( drozd.equals(kanareika));


        int a = 5;
        System.out.println(AnimalApp.returnInt(a));
        System.out.println(a);

        Integer aa = Integer.valueOf(a);
        System.out.println(AnimalApp.returnInt( aa ));
        System.out.println(aa);

    }


    public static int returnInt(int a){
        return (a = a + 1);
    }

    public static Integer returnInt(Integer a){
        return (a = a + 1);
    }


}
