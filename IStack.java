
/**
 * Interfaz que especifica los metodos que debe implementar la clase StackArrayList.
 * @author Pablo Zamora
 * @version 18/08/2022
 */
public interface IStack<T> {

	/** 
	* Metodo push. Permite almacenar un valor en la posicion 0 del arrayList.
	* @param value Valor que se almacena.
	*/
	void push(T value);
	
	/** 
	* Metodo pull. Permite obtener el valor en la posicion 0 del arrayList y eliminarlo de este.
	* @return Valor en la posicion 0.
	*/
	T pull();
	
	/**
	 * Metodo peek. Permite obtener el valor en la posicion 0 del arrayList sin eliminarlo.
	 * @return Valor en la posicion 0.
	 */
	T peek();
	
	/**
	 * Metodo count. Permite obtener la cantidad de valores almacenados en el ArrayList.
	 * @return Tamano del arrayList.
	 */
	int count();
	
	/**
	 * Metodo isEmpty. Permite determinar si el ArrayList esta vacio.
	 * @return Boolean. true si esta vacio, false si no lo esta.
	 */
	boolean isEmpty();
}
