import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
		private Random random = new Random();
		private Scanner scanner = new Scanner(System.in); 

		public void play(){
			int secretNumber = random.nextInt(100) + 1;
			int guess;
			int attempts = 0;

			System.out.println("Jogo de Adivinhação!");
			System.out.println("Tente adivinhar o número entre 1 e 100.");

			do {
				System.out.print("Digite seu palpite: ");
				guess = scanner.nextInt();
				attempts++;

				if(guess < 0 || guess > 100){
					System.out.println("Palpite inválido! O número é entre 1 e 100. Tente novamente.");
				} else if(guess < secretNumber){
					System.out.println("Muito baixo! Tente novamente.");
				} else if(guess > secretNumber){
					System.out.println("Muito Alto! Tente novamente.");
				}

			} while(guess != secretNumber);

			System.out.println("Parabéns, você acertou! Você descobriu que o número era " + secretNumber + " em " + attempts + " tentativas.");
		}
}
