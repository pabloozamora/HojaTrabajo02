/**
 * Programa de evaluación de expresiones postfix. Permite calcular el resultado de expresiones que se coloquen en un archivo .txt
 * mediante el uso de la estructura de datos "Pila" o "Stack".
 * Realizado por Pablo Zamora el 18/02/2022
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/**
 * Clase principal. Utiliza un scanner para leer el archivo .txt linea por linea y comunicarselas a la clase Calculadora.
 * @author Pablo Zamora
 * @version 18/02/2022
 */
public class Principal {

    /**
     * Metodo main. En este se lee el archivo .txt y se despliega el resultado de cada expresion dentro de este.
     * @param args
     */
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		String datos;
		
		File archivo = new File("datos.txt"); //Se verifica que el archivo de texto este en la carpeta
		if (!archivo.exists()) {
			System.out.println("\nBienvenido al evaluador de expresiones postfix. \nPor favor, verifique que el archivo de texto se encuentre dentro de la carpeta con todas las clases y reinicie el programa.\n");
		}
		else {
			try {
				Scanner teclado = new Scanner(archivo);
                System.out.println("\nBienvenido al evaluador de expresiones postfix. El resultado de cada expresion ingresada, linea por linea es:\n");
				while (teclado.hasNextLine()) { //Mientras haya una linea mas en el archivo
					datos = teclado.nextLine();
					int resultado = calculadora.Evaluate(datos);
					if (resultado == 9999999) { //Si hay menos operandos de los requeridos dentro de una expresion
						System.out.println("Operacion no valida");
					}
					else {
						System.out.println("Resultado: " + resultado);
					}
				}
			}
			catch (FileNotFoundException e) { //No se encuentra el archivo de texto
				System.out.println("\nVerifique que el archivo de texto se encuentre dentro de la carpeta con todas las clases");
			}
			
		}
		
	}
}
