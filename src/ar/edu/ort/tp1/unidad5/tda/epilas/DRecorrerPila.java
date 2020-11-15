package ar.edu.ort.tp1.unidad5.tda.epilas;

import ar.edu.ort.tp1.unidad5.tda.hinterfaces.Pila;
import ar.edu.ort.tp1.unidad5.tda.inodos.PilaNodos;

public class DRecorrerPila {

	public static void main(String[] args) {
		//Declaro una variable de tipo Interfaz Pila que va a contener clases de tipo String
		Pila<String> pila;
		//Instancio un clase de tipo PilaNodos que implementa la interfaz Pila y por ende es una operación segura
		//Upcasting
		pila = new PilaNodos<>();
		
		System.out.println("Apilamos algunos elementos...");
		pila.push("Pilas");
		pila.push("en");
		pila.push("Java");

		//Como recorrer una pila para mostrar sus elementos empezando por el primer elemento (el que esta más abajo)
		//Declaro una Pila auxiliar
		Pila<String> pilaAux = new PilaNodos<>();
		//Recorro la pila original y voy pasando los elementos a la auxiliar
		while (!pila.isEmpty()) {
			pilaAux.push(pila.pop());
		}
		System.out.println("Contenido de la pila empezando por el primer elemento");
		//Recorro la pila auxiliar, muestro el elemento y lo vuelvo a pasar a la pila original
		while (!pilaAux.isEmpty()) {
			String contenidoPila = pilaAux.pop();
			System.out.println(contenidoPila);
			pila.push(contenidoPila);
		}
	}
}