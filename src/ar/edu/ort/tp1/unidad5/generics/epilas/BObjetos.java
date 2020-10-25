package ar.edu.ort.tp1.unidad5.generics.epilas;

import edu.ort.tp1.u5.tda.Pila;
import edu.ort.tp1.u5.tda.nodos.PilaNodos;

public class BObjetos {

	public static void main(String[] args) {

		//Declaro una variable de tipo Interfaz Pila que va a contener clases de tipo String
		Pila<Auto> pila;
		//Instancio un clase de tipo PilaNodos que implementa la interfaz Pila y por ende es una operación segura
		//Upcasting
		pila = new PilaNodos<>();
		
		System.out.println("Apilamos algunos elementos...");
		Auto auto1 = new Auto("ABCD123", "Fiesta", "Ford");
		Auto auto2 = new Auto("RTY443", "Corolla", "Toyota");
		pila.push(auto1);
		pila.push(auto2);
		System.out.println("Elemento en la cima: " + pila.peek());//Devuelve el elemento que esta en la cima pero no lo retira
		System.out.println("Desapilamos todos elementos...");
		System.out.println(pila.pop());
		System.out.println(pila.pop());
		//System.out.println(s.pop());//Arroja una excepcion
		if(pila.isEmpty())//Metodo para validar si la pila esta vacia
			System.out.println("La pila esta vacia");
	}
}