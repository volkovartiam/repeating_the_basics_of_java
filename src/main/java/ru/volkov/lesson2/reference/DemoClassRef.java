package ru.volkov.lesson2.reference;

class DemoClassRef {
    public static void main(String[] args) throws ClassNotFoundException {

        Cat murka = new Cat("Murka");
        String type = Cat.type;
        Cat vasya = new Cat("Vasya");

        Cat.print();

        var murkaNew = new Cat(5, "Murka");
        System.out.println( murkaNew.getWeight() );

        Food food = new Food("Fish");
        murkaNew.eating(food);
        System.out.println( murkaNew.sing() );

        Cat kitty = new Kitty("kitty");
        System.out.println(kitty.sing() );
        kitty.eating(food);
//
//        if (murka != murkaNew) {
//            System.out.println("Коты разные");
//        } else if (murka == murkaNew){
//            System.out.println("Кот один");
//        }
//
//
//
//
//        murkaNew = murka;
//
//        if (murka != murkaNew) {
//            System.out.println("Коты разные");
//        } else {
//            System.out.println("Кот один");
//        }

    }
}
