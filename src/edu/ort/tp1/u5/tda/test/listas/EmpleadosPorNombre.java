package edu.ort.tp1.u5.tda.test.listas;

import edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

public class EmpleadosPorNombre extends ListaOrdenadaNodos<String, Empleado> {

	@Override
	public int compare(Empleado dato1, Empleado dato2) {
		return dato1.getNombre().compareTo(dato2.getNombre());
	}

	@Override
	public int compareByKey(String clave, Empleado empleado) {
		return clave.compareTo(empleado.getNombre());
	}

}
