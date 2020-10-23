import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number, horast;
		double valorhora, salario;
		
		number = sc.nextInt();
		horast = sc.nextInt();
		valorhora = sc.nextDouble();
		
		salario = horast * valorhora;
		
		System.out.println("NUMBER = "+ number);
		System.out.printf("SALARY = %.2f ", salario);
		
		
		sc.close();
	}

}
