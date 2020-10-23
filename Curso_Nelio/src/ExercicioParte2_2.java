import java.util.Scanner;

public class ExercicioParte2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;

		num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("Numero PAR");
		} else {
			System.out.println("IMPAR");
		}

		sc.close();
	}

}
