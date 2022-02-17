import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		String datos;
		
		File archivo = new File("C:\\Users\\Pablo Zamora\\Documents\\2022\\Semestre 1 2022\\Algoritmos\\Eclipse\\Hoja de Trabajo 2\\src\\src\\com\\uvg\\main\\datos.txt");
		if (!archivo.exists()) {
			System.out.println("\nVerifique que el archivo de texto se encuentre dentro de la carpeta con todas las clases");
		}
		else {
			System.out.println("nice");
			try {
				Scanner teclado = new Scanner(archivo);
				while (teclado.hasNextLine()) {
					datos = teclado.nextLine();
					}
			}
			catch (FileNotFoundException e) {
				System.out.println("\nVerifique que el archivo de texto se encuentre dentro de la carpeta con todas las clases");
			}
			
		}
		
	}
}

