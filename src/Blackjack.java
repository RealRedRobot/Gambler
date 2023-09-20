import java.util.Scanner;
import java.lang.Math;

public class Blackjack {

    public void play() {

        Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to Blackjack!");
    System.out.println("You have $1000.00");
    System.out.println("How much would you like to bet?");

    double bet = sc.nextDouble();
    double money = 1000.00;

    if (bet > money) {
        System.out.println("You don't have enough money to bet that much!");
        System.out.println("How much would you like to bet?");
        bet = sc.nextDouble();

    }

    System.out.println("You bet $" + bet);
    System.out.println("You have $" + (money - bet) + " left.");
    System.out.println("Let's play!");

    // Player's first card
    //The cards range from 1 to 11, an Ace can be 1 or 11, a face card is 10 and any other card is its number.

    int card1 = (int)(Math.random() * 11) + 1;

        if (card1 == 1) {
            System.out.println("You drew an Ace!");
            System.out.println("Would you like it to be a 1 or 11?");
            int ace = sc.nextInt();
            if (ace == 1) {
            card1 = 1;
            } else if (ace == 11) {
            card1 = 11;
            } else {
                System.out.println("Invalid choice");
            }

    
    }

    if (card1 > 1) {
        System.out.println("You drew a " + card1);
    }

    // Player's second card
    int card2 = (int)(Math.random() * 11) + 1;

    if (card1 == 11 && card2 == 1) {
        card2 = 1;
    }
    
    if (card1 == 1 && card2 == 1) {
        System.out.println("You drew another Ace!");
        System.out.println("Would you like it to be a 1 or 11?");
        int ace = sc.nextInt();
        if (ace == 1) {
            card2 = 1;
        } else if (ace == 11) {
            card2 = 11;
        } else {
            System.out.println("Invalid choice");
        }


    }

    if (card2 > 1) {
        System.out.println("You drew a " + card2);

    }


}

}
