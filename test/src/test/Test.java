package test;
import java.util.Scanner;

public class Test {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		String nombre = null;
		
		System.out.println("Hola mundo");
		System.out.println("Indique su nombre: ");
		nombre = teclado.nextLine();
		System.out.println("Hola " +nombre);
	}
	
}