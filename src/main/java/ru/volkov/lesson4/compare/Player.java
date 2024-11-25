package ru.volkov.lesson4.compare;

public class Player implements Comparable<Player> {
    private int ranking;
    private String name;
    private int age;

    public Player(int ranking, String name, int age) {
        this.ranking = ranking;
        this.name = name;
        this.age = age;
    }

    public int getRanking() {
        return ranking;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Player{" +
               "ranking=" + ranking +
               ", name='" + name + '\'' +
               ", age=" + age +
               '}';
    }

    @Override
    public int compareTo(Player otherPlayer) {
        int otherRanking = otherPlayer.getRanking();
//        if (getRanking() < otherRanking) {
//            return  -1;
//        } else if (getRanking() == otherRanking) {
//            return 0;
//        } else {
//            return  1;
//        }

        return Integer.compare(getRanking(), otherRanking);
    }
}
