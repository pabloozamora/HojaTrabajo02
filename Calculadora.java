public class Calculadora implements IPosfixCalc{

	public int Evaluate(String datos) {
		int resultado = 0;
		int operando_1 = 0;
		int operando_2 = 0;
		String[] lista = datos.split(" ");
		StackArrayList<Integer> stack = new StackArrayList<>();
		for (int caracter = 0; caracter < lista.length; caracter++) {
			if (lista[caracter].equals("+") || lista[caracter].equals("-") || lista[caracter].equals("*") || lista[caracter].equals("/")) {
				String signo = lista[caracter];
				if (stack.count()>1) {
					if (signo.equals("+")) {
						operando_1 = stack.pull();
						operando_2 = stack.pull();
						resultado = operando_2 + operando_1;
						stack.push(resultado);
					}
					else if (signo.equals("*")) {
						operando_1 = stack.pull();
						operando_2 = stack.pull();
						resultado = operando_2 * operando_1;
						stack.push(resultado);
					}
					else if (signo.equals("-")) {
						operando_1 = stack.pull();
						operando_2 = stack.pull();
						resultado = operando_2 - operando_1;
						stack.push(resultado);
					}
					else if (signo.equals("/")) {
						operando_1 = stack.pull();
						operando_2 = stack.pull();
						resultado = operando_2 / operando_1;
						stack.push(resultado);
					}
				}
				else {
					resultado = 9999999;
					break;
				}
				
			}
			else {
				stack.push(Integer.parseInt(lista[caracter]));
			}
			
		}
		return resultado;
	}

}