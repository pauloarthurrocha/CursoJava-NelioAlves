import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod1, cod2, num1, num2;
		double valor1, valor2, preço;

		cod1 = sc.nextInt();
		num1 = sc.nextInt();
		valor1 = sc.nextDouble();

		cod2 = sc.nextInt();
		num2 = sc.nextInt();
		valor2 = sc.nextDouble();

		preço = valor1 * num1 + valor2 * num2;

		System.out.println("VALOR A PAGAR DOS PRODUTOS " + cod1 + " e " + cod2 + ": R$ " + preço);

		sc.close();
	}

}
