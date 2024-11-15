package ru.volkov;

public class ExtendedClass extends ClassExample{

    public void print(){
        System.out.println("Extended print method");
    }

    public void anotherPrint(){
        super.print();
    }

    public void anotherPrint_2(){
        this.print();
    }


    static {
        System.out.println("Печать из статического блока инициализации класса ExtendedClass ");
    }

    static int i = 0;
    {
        System.out.println("Печать из нестатического блока инициализации класса ExtendedClass " + i++);
    }

}
