package ar.edu.ort.tp1.unidad5.generics.danidados;

import java.util.ArrayList;

public class TestCaja2 {

	private static final int CANTIDAD_DE_CAJAS = 4;

	public static void main(String[] args) {
		
		//Recien vimos que podemos anidar generics en caso de ser necesario, por ejemplo usando ArrayList:
		ParDeZapatos zapatos = new ParDeZapatos("Negros");
		Caja<ParDeZapatos> cajaDeZapatos = new Caja<>();
		cajaDeZapatos.guardar(zapatos);
		ArrayList<Caja<ParDeZapatos>> miColeccionDeZapatos = new ArrayList<>();
		CajaDeZapatos caja = new CajaDeZapatos();
		
//Pero si intentamos hacer lo mismo con arrays nativos:
//Veremos que Arrays y Generics no se llevan bien en Java, al menos al momento de declarar e inicializar el array. 
//Esto se debe a lo que cada estructura necesita resolver en tiempo de compilación y cómo maneja la memoria para 
//sí misma y para su contenido. Podemos resumirlo en que mientras que a un ArrayList (o cualquier estructura que 
//use Generics) no le importa el tipo del dato contenido, a un Array sí le importa.
//Los tipos genéricos en el código son una "ilusión" en tiempo de compilación, "comodines" que serán reemplazados 
//por la clase real, y ahí está la "magia". Cuando tenemos una variable de tipo como T (suponiendo que declaramos 
//Clase<T>), el código usa este tipo como "comodín". No puede saber realmente a qué tipo se refiere realmente T, y 
//sin embargo, sea cual fuere la clase que ocupe el lugar de T, el código funcionará sin problemas. Pero mientras 
//una clase que usa generics no necesita conocer realmente qué elemento tiene, un arreglo necesita conocer 
//explícitamente el tipo de dato, no puede "dejarlo para después"
		Caja<ParDeZapatos> [] caja2 = new Caja<ParDeZapatos>[CANTIDAD_DE_CAJAS];//Error de compilacion
		
//Lo solucionamos creando una nueva clase que encapsule a la clase Caja<ParDeZapatos>,
//Así, al quedar escondida la definición genérica inicial, se puede crear e inicializar un Array de la nueva clase 
//sin problemas porque la nueva clase ya es de un tipo concreto:
		CajaDeZapatos [] zapatero = new CajaDeZapatos[CANTIDAD_DE_CAJAS];
		CajaDeZapatos caja3 = new CajaDeZapatos();
		caja.guardar(zapatos);
		zapatero[0] = caja;
	}
}