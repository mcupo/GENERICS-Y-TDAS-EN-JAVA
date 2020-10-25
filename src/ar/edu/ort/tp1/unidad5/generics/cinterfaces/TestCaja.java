package ar.edu.ort.tp1.unidad5.generics.cinterfaces;

import ar.edu.ort.tp1.unidad5.generics.danidados.ParDeZapatos;

public class TestCaja {

	public static void main(String[] args) {
		
		Caja<ParDeZapatos> unaCaja = new Caja<ParDeZapatos>();
		unaCaja.guardar(new ParDeZapatos("Negro"));
	}
}