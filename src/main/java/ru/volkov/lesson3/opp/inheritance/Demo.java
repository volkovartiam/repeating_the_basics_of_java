package ru.volkov.lesson3.opp.inheritance;

import ru.volkov.lesson3.opp.inheritance.person.Captain;
import ru.volkov.lesson3.opp.inheritance.person.Marine;
import ru.volkov.lesson3.opp.inheritance.person.Person;
import ru.volkov.lesson3.opp.inheritance.phone.AbstractPhone;
import ru.volkov.lesson3.opp.inheritance.phone.CellPhone;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        AbstractPhone mts = new CellPhone(2012, 4);
        mts.call(464);
    }
}
