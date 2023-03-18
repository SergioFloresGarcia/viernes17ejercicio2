import java.util.Scanner;
public class viernes17ejercicio2 {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Ingrese un numero para sumar:");
		int n = number.nextInt();

		int suma = 0; //la variable suma

		for (int i = 0; i <= n; i++) {

			suma = suma + i;
		}
		System.out.println("La suma es: "+suma);
	}
	}
