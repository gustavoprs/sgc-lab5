import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {    

    static Scanner in = new Scanner(System.in);

    public static int antiMismatch() {
        int out = -1;
        try {
            out = in.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("\nERRO: Escolha uma das opções através dos números correspondentes! Apenas números são válidos.");
            in.nextLine();
            out = -1;
        }
        return out;
    }

    public static void main(String[] args) {
        int e = -1;
        do {
            System.out.println("========================[MENU PRINCIPAL]========================\n\n\t[1] Bom dia! (?)\n\t[2] Pedra, Papel, Tesoura!\n\t[3] (Em breve...)\n\n\t[0] Sair.");
            e = antiMismatch();
            switch (e) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    do {
                        System.out.println("\nBoa tarde?\n\n\t[1] Boa tarde!\n\t[2] Boa noite, na verdade.\n\t[3] Bom dia, afinal qualquer momento do dia ainda é o dia.\n\n\t[0] Tchau.");
                        e = antiMismatch();
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
                                System.out.println("\nEssa é a ideia certa, exatamente!!\nJá que tu sacou já, vou indo nessa...");
                                e = 0;
                                break;
                            default:
                                break;
                        }
                    } while(e != 0);
                    e = -1;
                    break;
                case 2:
                    RPSManager mgr = new RPSManager();
                    System.out.println("\nPedra, papel ou tesoura? Faça sua escolha sabiamente... \n\n\t[1] Pedra\n\t[2] Papel\n\t[3] Tesoura\n\n\t[0] Voltar");
                    e = antiMismatch();
                    switch (e) {
                        case 1, 2, 3:
                            System.out.println(mgr.play(e));
                            break;
                        default:
                            break;
                    }
                case 3:
                //TODO Gustavo P.
                default:
                    break;
            }
        } while (e != 0);
    }
}
