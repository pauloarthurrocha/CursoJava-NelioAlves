import java.util.Scanner;

public class ExercicioParte2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
	  numero = sc.nextInt();
	  
	  if (numero >=0 ) {
		  System.out.println("NUMERO NAO NEGATIVO");
		
	}else 
		{ System.out.println("NUMERO NEGATIVO");
	}
		

		sc.close();
	}

}
