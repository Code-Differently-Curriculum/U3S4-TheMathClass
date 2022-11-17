package com.codedifferently.labs.partA;
public class RockPaperScissor {
    public static void main(String[] args) {
 Scanner RPC = new Scanner(System.in);
        System.out.println("You - Rock 1, Paper 2, Siccors 3,: (CHOOSE)");
        int you = RPC.nextInt();
        Random rpc = new Random();
        int winner = rpc.nextInt(3)+1;
        System.out.println("Your # is: " +you);
        System.out.println("Winner # is: " +winner);

    }
}
