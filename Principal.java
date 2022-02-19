import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		String datos;
		
		File archivo = new File("datos.txt");
		if (!archivo.exists()) {
			System.out.println("\nVerifique que el archivo de texto se encuentre dentro de la carpeta con todas las clases");
		}
		else {
			try {
				Scanner teclado = new Scanner(archivo);
				while (teclado.hasNextLine()) {
					datos = teclado.nextLine();
					int resultado = calculadora.Evaluate(datos);
					if (resultado == 9999999) {
						System.out.println("Operacion no valida");
					}
					else {
						System.out.println("Resultado: " + resultado);
					}
				}
			}
			catch (FileNotFoundException e) {
				System.out.println("\nVerifique que el archivo de texto se encuentre dentro de la carpeta con todas las clases");
			}
			
		}
		
	}
}
