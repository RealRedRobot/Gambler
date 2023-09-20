import java.util.Scanner;
import java.lang.Math;


public class Roulette {

    public void play() {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of players: ");
        int players = sc.nextInt();

        int[] playerBets = new int[players];
        int[] playerNumbers = new int[players];

        for (int i = 0; i < players; i++) {
            System.out.println("Player " + (i + 1) + ": ");
            playerBets[i] = sc.nextInt();
            playerNumbers[i] = (int) (Math.random() * 37);
        }

        int winningNumber = (int) (Math.random() * 37);

        int max = 0;
        int winner = 0;
        for (int i = 0; i < players; i++) {
            if (playerNumbers[i] == winningNumber) {
                max = playerBets[i] * 36;
                winner = i;
            }
        }

        System.out.println("Player " + (winner + 1) + " wins with " + max + " points");

    
    }

}
