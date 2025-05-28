import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {    
    public static void main(String[] args) {
        int e = -1;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("\nBoa tarde?\n\t[1] Boa tarde!\n\t[2] Boa noite, na verdade.\n\t[3] Adivinhe o número!.\n\n\t[0] Tchau.");
            try {
                e = in.nextInt();
            } catch (InputMismatchException exception) {
                System.out.println("\nERRO: Só pode número, escolhe uma das opções!");
                in.nextLine();
                e = -1;
            }
            switch (e) {
                case 0:
                    System.out.println("\nTchau então :/\n");
                    break;
                case 1:
                    System.out.println("\nMas no fim pode ser bom dia né, afinal qualquer momento do dia ainda é o dia.");
                    break;
                case 2:
                    System.out.println("\nMas tu não acha que podia ser bom dia também? No fim, qualquer momento do dia ainda é o dia.");
                    break;
                case 3:
										GuessingGame guessingGame = new GuessingGame();
										guessingGame.play();
                    break;
                default:
                    break;
            }
        } while (e != 0);

        System.exit(0);
    }
}