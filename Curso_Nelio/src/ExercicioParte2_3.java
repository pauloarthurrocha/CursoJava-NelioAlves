import java.util.Scanner;

public class ExercicioParte2_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A, B;

		A = sc.nextInt();
		B = sc.nextInt();

		if (A % B == 0 || B % A == 0) {
			System.out.println("Numeros Multiplos");
		} else {
			System.out.println("Numero N�o Multiplos");
		}

		sc.close();
	}

}
