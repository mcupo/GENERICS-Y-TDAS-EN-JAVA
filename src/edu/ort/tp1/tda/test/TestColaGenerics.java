package edu.ort.tp1.tda.test;

import edu.ort.tp1.u5.tda.Cola;
import edu.ort.tp1.u5.tda.nodos.ColaNodos;

public class TestColaGenerics {

	public static void main(String[] args) {
		System.out.println("PROBANDO COLA DE ENTEROS");
		Cola<Integer> colaEnteros;
		colaEnteros = new ColaNodos<>();
		colaEnteros.add(1);
		mostrarEstado(colaEnteros);
		System.out.println("elemento devuelto: " + colaEnteros.remove());
		mostrarEstado(colaEnteros);

		System.out.println();
		System.out.println("PROBANDO UNA COLA DE STRINGS");
		Cola<String> colaStrings;

		colaStrings = new ColaNodos<>();
		colaStrings.add("hola");
		colaStrings.add("que");
		colaStrings.add("tal");
		mostrarEstado(colaStrings);
		while (!colaStrings.isEmpty()) {
			System.out.println("elemento devuelto: " + colaStrings.remove());
			mostrarEstado(colaStrings);
		}
	}

	private static void mostrarEstado(Cola<?> cola) {
		System.out.println("\testa vacia? " + cola.isEmpty());
		System.out.println("\testa llena? " + cola.isFull());
		System.out.print("\tque hay en el tope? ");
		if (!cola.isEmpty()) {
			System.out.println(" " + cola.get());
		} else {
			System.out.println(" No hay nada en esta pobre cola, snif... ='(");
		}
	}
}