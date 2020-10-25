package edu.ort.tp1.u5.tda.test.listas;

import edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

public class EmpleadosPorLegajo extends ListaOrdenadaNodos<Integer, Empleado> {

	@Override
	public int compare(Empleado empleado1, Empleado empleado2) {
		return empleado1.getLegajo() - empleado2.getLegajo();
	}

	@Override
	public int compareByKey(Integer clave, Empleado empleado) {
		return clave - empleado.getLegajo();
	}

}