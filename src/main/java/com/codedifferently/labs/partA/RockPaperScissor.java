package com.codedifferently.labs.partA;
import java.util.Random;
public class RockPaperScissor {
    public static void main(String[] args) {
        // 0 = Rock
        // 1 = Paper
        //2 = Siccors
        Random num = new Random();
        int you = num.nextInt(3);
        int winner = num.nextInt(3);
        System.out.println("you chose" +you);
        System.out.println("winner num" +winner);

    }
}
