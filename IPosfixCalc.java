/**
 * Interfaz que especifica los metodos que debe implementar la clase Calculadora.
 * @author Pablo Zamora
 * @version 18/02/2022
 */
public interface IPosfixCalc {

	/***
	 * Metodo que permite evaluar una expresion postfix.
	 * @param expresion Expresion a evaluar
	 * @return Resultado
	 */
	int Evaluate(String expresion);
}
