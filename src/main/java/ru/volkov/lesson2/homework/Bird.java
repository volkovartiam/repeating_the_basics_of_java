package ru.volkov.lesson2.homework;

public class Bird extends Animal implements Flyable, Singable {

    String type;
    private Plumage plumage;

    private final boolean isFly;
    private boolean isSing = false;


    public Bird(String type, boolean isFly){
        super("Животные");
        this.type = type;
        this.isFly = isFly;
        this.plumage = new Plumage("");
    }

    public void setSing(boolean isSing) { this.isSing = isSing; }
    public void setPlumage(Plumage plumage) {
        this.plumage = plumage;
    }


    @Override
    public String toString() {
        String flyDescription = "";
        if(isFly){
            flyDescription = "летает";
        }else{
            flyDescription = "ходит";
        }

        String singDescription = "";
        if(isSing){
            singDescription = "поет";
        }

        return  this.getDescription() + " " + "Птица {" +
                type + " " +
                this.plumage.getColor() + " " +
                flyDescription + " " +
                singDescription + "" +
                '}' ;
    }

    @Override
    public boolean isFly() {
        return this.isFly;
    }

    @Override
    public boolean isSing() {
        return this.isSing;
    }
}
