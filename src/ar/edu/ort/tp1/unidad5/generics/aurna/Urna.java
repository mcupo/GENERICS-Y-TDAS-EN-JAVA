package ar.edu.ort.tp1.unidad5.generics.aurna;

import java.util.ArrayList;

/**
 * Una urna es una clase especial que soporta Generics para guardar en ella
 * cualquier tipo de elemento que se necesite guardar. A la hora de extraer un
 * elemento, este elemento sera elegido al azar de entre cualquiera de los
 * elementos que se encuentren en ese momento guardados en la urna.
 * 
 * Internamente, para guardar los elementos, usa un arrayList.
 *
 * @param <E>
 *            El tipo (la clase) de elemento que contendra. Siempre debe ser una
 *            clase porque Generics solo soporta que los elementos sean objetos.
 * 
 * Para declarar que una clase utiliza uno o más parámetros de clase alcanza con incluir
 * variables de tipo encerradas en el diamante (entre los paréntesis agudos "<" y ">") de su
 * declaración:
 */
public class Urna<E> {

	private ArrayList<E> elementos;

	public Urna() {
		elementos = new ArrayList<>();
	}

	/**
	 * Agrega un elemento a la estructura
	 * 
	 * @param elemento
	 */
	public void add(E elemento) {
		elementos.add(elemento);
	}

	/**
	 * @return La cantidad de elementos contenidos.
	 */
	public int elementCount() {
		return elementos.size();
	}

	/**
	 * Extrae un elemento al azar de los que se encuentran en la estructura (en
	 * el ArrayList interno).
	 * 
	 * @return El elemento que se extrajo del ArrayList. Si no hay ningun
	 *         elemento devolvera null.
	 */
	public E remove() {
		E elemento = null;
		if (!isEmpty()) {
			int pos = (int) (Math.random() * elementos.size());
			elemento = elementos.remove(pos);
		}
		return elemento;
	}

	/**
	 * @return Un booleano indicando su hay elementos guardados o no.
	 */
	public boolean isEmpty() {
		return elementos.isEmpty();
	}
}