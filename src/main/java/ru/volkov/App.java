package ru.volkov;

/**
 * Hello world!
 *
 */
public class App 
{

    static {
        System.out.println("Печать из статического блока инициализации класса  App ");
    }
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        ClassExample.Inner inner = new ClassExample.Inner();

//        ClassExample example = new ClassExample();
//        example.print();
        // java: ru.volkov.ClassExample is abstract; cannot be instantiated
        /* если класс будет абстрактным, то нельзя создать экземпляр класса
        * */

        ExtendedClass extendedClass = new ExtendedClass();
        ExtendedClass extendedClass_2 = new ExtendedClass();

        extendedClass.print();
        extendedClass.anotherPrint();
        extendedClass.anotherPrint_2();

    }
}
