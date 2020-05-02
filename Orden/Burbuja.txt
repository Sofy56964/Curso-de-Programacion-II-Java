package Orden;      //crea el paquete 

public class Burbuja extends Ordenamiento{         //la palabra extends denota herencia en la aplicacion

	@Override     //para sobreescribir el metodo de la clase padre con el comportamiento de cada subclase (va antes del metodo que se va a sobreescribir)

	public void TipoOrdenamiento(){       //metodo que permitira hacer el ordenamiento de burbuja
		//Algoritmo Metodo de Burbuja
		for(i=0; i<tam; i++){      //for que recorre el arreglo original(desordenado)
			for(j=i+1; j<tam; j++){       //for que recorrre el arreglo a partir de la segunda posicion 
				if(array[i] > array[j]){      //si el numero actual(i) es mayor al numero siguiente(j), entonces hara el intercambio
					aux = array[i];      //el auxiliar es igual al numero actual(i)
					array[i] = array[j];     //ahora el numero actual se le agrega el valor del numero siguiente(como el valor siguiente seria i+1, pero ya declaramos en el for que j=i+1, entonces j es el numero siguiente) 
					array[j] = aux;          //el numero siguiente(j) es igual al numero actual 
				}
			}
		}
	}//llave del metodo TipoOrdenamiento

}