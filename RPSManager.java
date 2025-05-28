import java.util.Random;

enum Rps {
    ROCK("Pedra"),
    PAPER("Papel"),
    SCISSORS("Tesoura");

    private final String dsc;

    Rps(String dsc) {
        this.dsc = dsc;
    }

    public String getDsc() {
        return this.dsc;
    }
}

public class RPSManager {
    private Rps playerOp, pcOp;
    private Random random = new Random();

    // 0 -> Draw || 1 -> Player win || 2 -> PC win
    public String play(int e) {
        int res = -1;
        setPcOp();
        setPlayerOp(e);
        if (getPcOp() == getPlayerOp()) res = 0;
        else if (getPlayerOp() == Rps.PAPER && getPcOp() == Rps.ROCK) res = 1;
        else if (getPlayerOp() == Rps.SCISSORS && getPcOp() == Rps.PAPER) res = 1;
        else if (getPlayerOp() == Rps.ROCK && getPcOp() == Rps.SCISSORS) res = 1;
        else res = 2;

        String ops = "\tSua escolha: " + getPlayerOp().getDsc() + "\n\tEscolha do oponente: " + getPcOp().getDsc();

        switch (res) {
            case 0:
                return "\nFim de jogo! [EMPATE]\n" + ops;
            case 1:
                return "\nFim de jogo! [VITÓRIA]\n" + ops;
            case 2:
                return "\nFim de jogo! [DERROTA]\n" + ops;
            default:
                return "\nERRO: Resultado não identificado.";
        }
    }

    public Rps getPlayerOp() {
        return this.playerOp;
    }

    public void setPlayerOp(int op) {
        switch (op) {
            case 1:
                this.playerOp = Rps.ROCK;
                break;
            case 2:
                this.playerOp = Rps.PAPER;
                break;
            case 3:
                this.playerOp = Rps.SCISSORS;
                break;
            default:
                System.out.println("\nERRO: Opção inválida.");
                break;
        }
    }

    public Rps getPcOp() {
        return this.pcOp;
    }

    public void setPcOp() {
        int op = random.nextInt(3) + 1;
        switch (op) {
            case 1:
                this.pcOp = Rps.ROCK;
                break;
            case 2:
                this.pcOp = Rps.PAPER;
                break;
            case 3:
                this.pcOp = Rps.SCISSORS;
                break;
            default:
                System.out.println("\nERRO: Opção inválida.");
                break;
        }
    }
}
