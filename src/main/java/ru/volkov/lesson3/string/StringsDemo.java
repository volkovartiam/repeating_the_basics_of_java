package ru.volkov.lesson3.string;

public class StringsDemo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        System.out.println(str1 == str2);

        str1 = str1 + "111";

        String hello3 = new String("Hello");
        System.out.println(str1 == hello3);

        String hello4 = new String("Hello");
        System.out.println(hello3 == hello4);



//        String intern3 = hello3.intern();
//        String intern4 = hello4.intern();
//
//        System.out.println(intern3 == intern4);
//        System.out.println(str1 == intern3);
    }
}
