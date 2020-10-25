package ar.edu.ort.tp1.unidad5.generics.epilas;

import edu.ort.tp1.u5.tda.Pila;
import edu.ort.tp1.u5.tda.nodos.PilaNodos;

public class ATiposSimples {

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
		System.out.println("Elemento en la cima: " + pila.peek());//Devuelve el elemento que esta en la cima pero no lo retira
		//System.out.println("Tamaño de la pila: " + pila.size());//Arroja una excepcion, el tamaño de la pila no es visible
		System.out.println("Desapilamos todos elementos...");
		System.out.println(pila.pop());
		System.out.println(pila.pop());
		System.out.println(pila.pop());
		//System.out.println(pila.pop());//Arroja una excepcion del tipo EmptyStackException
		if(pila.isEmpty())//Metodo para validar si la pila esta vacia
			System.out.println("La pila esta vacia");
	}
}