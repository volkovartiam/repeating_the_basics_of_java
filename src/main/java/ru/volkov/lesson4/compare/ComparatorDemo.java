package ru.volkov.lesson4.compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {

        Player player1 = new Player(59, "John", 20);
        Player player2 = new Player(67, "Roger", 22);
        Player player3 = new Player(45, "Steven", 24);
        Player player4 = new Player(55, "Nick", 18);
        List<Player> footballTeam = Arrays.asList(player1, player2, player3, player4);

        PlayerRankingComparator playerRankingComparator = new PlayerRankingComparator();
        Collections.sort(footballTeam, playerRankingComparator);
        System.out.println("Sorting by Range : " + footballTeam);

        PlayerAgeComparator playerAgeComparator = new PlayerAgeComparator();
        Collections.sort(footballTeam, playerAgeComparator);
        System.out.println("Sorting by Age : " + footballTeam);
    }
}
