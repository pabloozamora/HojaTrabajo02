public class Calculadora implements IPosfixCalc{
	private StackArrayList<Integer> stack = new StackArrayList<>();

	@Override
	public int Evaluate(String datos) {
		int resultado = 0;
		String[] lista = datos.split(" ");
		for (int caracter = 0; caracter < lista.length; caracter++) {
			if (lista[caracter].equals("+") || lista[caracter].equals("-") || lista[caracter].equals("*") || lista[caracter].equals("/")) {
				String signo = lista[caracter];
				if (stack.count()>1) {
					int cuenta = stack.count();
					if (signo.equals("+")) {
						resultado = stack.pop();
						for (int elemento = 0; elemento <= cuenta;elemento++) {
							resultado += stack.pop();
						}
						stack.push(resultado);
					}
					else if (signo.equals("*")) {
						resultado = stack.pop();
						for (int elemento = 0; elemento <= cuenta;elemento++) {
							resultado *= stack.pop();
						}
						stack.push(resultado);
					}
					else if (signo.equals("-")) {
						StackArrayList<Integer> stackResta = new StackArrayList<>();
						for (int elemento = 0; elemento <= cuenta;elemento++) {
							stackResta.push(stack.pop());
						}
						for (int elemento = 0; elemento <= cuenta;elemento++) {
							resultado -= stack.pop();
						}
						stack.push(resultado);
					}
					else if (signo.equals("/")) {
						StackArrayList<Integer> stackDivision = new StackArrayList<>();
						for (int elemento = 0; elemento <= cuenta;elemento++) {
							stackDivision.push(stack.pop());
						}
						for (int elemento = 0; elemento <= stackDivision.count();elemento++) {
							resultado -= stack.pop();
						}
						stack.push(resultado);
					}
				}
				else {
					resultado = 9999999;
				}
				
			}
			else {
				stack.push(Integer.parseInt(lista[caracter]));
			}
			
		}
	}

}