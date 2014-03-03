package test;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String nombre = null;
		int edad = 0;
		
		datos_persona(teclado,nombre,edad);

	}
	
	
	private static String datos_persona(Scanner teclado, String nombre, int edad) {
		
		System.out.println("Indique el nombre: ");
		nombre = teclado.nextLine();
		
		System.out.println("Indique la edad: ");
		edad = teclado.nextInt();
		
		System.out.println(nombre);
		System.out.println(edad);
		
		return nombre;
	}
	
	
	
}