package ru.volkov.lesson6.exceptions;

import java.io.IOException;
import java.sql.SQLDataException;
import java.util.ArrayList;
import java.util.List;

public class ExceptionRunner {
    public static void main(String[] args) {
//        demoError();
//        demoRuntimeException();
        demoRuntimeExceptionWithCatch();
        try {
            notSafeDeletionChain(10);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException " + e.getMessage());
        } catch (SomeException e) {
            System.out.println("SomeException " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException " + e.getMessage());
            e.printStackTrace();
        }
//        notSafeDeletionThrow(0);
    }

    private static void demoError() {
        Long recursion = recursion(1L);
    }

    private static void demoRuntimeException() {
        System.out.println("Before");
        List<String> str = new ArrayList<>();
        extracted(str);
        System.out.println("After");
    }

    private static void extracted(List<String> str) {
        System.out.println(str.get(10));
    }

    private static void demoRuntimeExceptionWithCatch() {
        System.out.println("Before");

        List<String> str = new ArrayList<>();
        str.add("element");
        try {
            str.get(1);
            System.out.println("After in try");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("In catch message " + e.getMessage() );
        } finally {
            System.out.println("After in finally");
        }
    }

    private static Long recursion(Long l) {
        if (l == 1000L) {
            //return l;
        }
        System.out.println(l);
        return l * recursion(++l);
    }

    static void notSafeDeletionThrow(int number) {
        try {
            System.out.println(9 / number);
        } catch (ArithmeticException exception) {
            System.err.println(exception.getMessage());
            exception.printStackTrace();
            throw new UserNotFoundException(exception);
        }
    }

    static void notSafeDeletionChain(int number) {
        notSafeDeletion3(number);
    }

    static void notSafeDeletion3(int number) {
        notSafeDeletion4(number);
    }

    static void notSafeDeletion4(int number) {
        if (number == 10) {
            throw new SomeException("New exception");
        }
        System.out.println(9 / number);

    }
}
