import java.util.Scanner;
import java.lang.Math;

public class Blackjack {

    public void play() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of players: ");
        int players = sc.nextInt();

        int[] playerCards = new int[players];
        int[] playerSum = new int[players];

        for (int i = 0; i < players; i++) {
            System.out.println("Player " + (i + 1) + ": ");
            playerCards[i] = sc.nextInt();
        }

        for (int i = 0; i < players; i++) {
            int sum = 0;
            for (int j = 0; j < playerCards[i]; j++) {
                int card = (int) (Math.random() * 13) + 1;
                if (card > 10) {
                    card = 10;
                }
                sum += card;
            }
            playerSum[i] = sum;
        }

        int max = 0;
        int winner = 0;
        for (int i = 0; i < players; i++) {
            if (playerSum[i] > max && playerSum[i] <= 21) {
                max = playerSum[i];
                winner = i;
            }
        }

        System.out.println("Player " + (winner + 1) + " wins with " + max + " points");

    }
    
}
