import java.util.Locale;
import java.util.Scanner;

public class ExercicioParte2_6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double valor = sc.nextDouble();

		if (valor < 0.0 || valor > 100) {
			System.out.println("Fora de Intervalo");
		} else if (valor <= 25) {
			System.out.println("Intervalo entre 0 - 25");
		} else if (valor <= 50) {
			System.out.println("Intervalo entre 25 - 50");
		} else if (valor <= 75) {
			System.out.println("Intervalo entre 50 - 75");
		} else if (valor <= 100) {
			System.out.println("Intervalo entre 75 - 100");
		}

		sc.close();
	}

}
