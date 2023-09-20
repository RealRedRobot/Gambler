import java.util.Scanner;
import java.lang.Math;


public class Gambler {
    public static void main(String[] args ) {
        System.out.println("Welcome to Gambler Simulation Problem");

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the game you want to play: ");
        System.out.println("1. Blackjack");
        System.out.println("2. Roulette");

        int game = sc.nextInt();

        switch (game) {
            case 1:
                Blackjack blackjack = new Blackjack();
                blackjack.play();
                break;
            case 2:
                Roulette roulette = new Roulette();
                roulette.play();
                break;
            default:
                System.out.println("Invalid choice");
        }

    }
}
