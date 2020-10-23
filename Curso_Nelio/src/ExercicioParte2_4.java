import java.util.Scanner;

public class ExercicioParte2_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int inicio, termino, duracao;

		inicio = sc.nextInt();
		termino = sc.nextInt();

		if (inicio < termino) {
			duracao = termino - inicio;
		} else {
			duracao = 24 - inicio + termino;
		}

		System.out.println("O JOGO DUROU " + duracao + " HORAS");

		sc.close();
	}

}
