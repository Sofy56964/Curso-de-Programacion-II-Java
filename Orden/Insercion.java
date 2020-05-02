package Orden;      //crea el paquete 

public class Insercion extends Ordenamiento{          //la palabra extends denota herencia en la aplicacion
	
	@Override     //para sobreescribir el metodo de la clase padre con el comportamiento de cada subclase (va antes del metodo que se va a sobreescribir)

	public void TipoOrdenamiento(){       //metodo que permitira hacer el ordenamiento de seleccion
		//Algoritmo de Ordenamiento por Insercion
		for(i=0; i<tam; i++){
			j = i;      //j representa la posicion(flecha), la cual equivale al valor del bucle en el que vamos
			aux = array[i];     //es el numero del arreglo que se va comprobando

							           //(j>0) nos dice que como no se puede comprobar la 1era posicion o la posicion 0, entonces debe ser mayor a cero para que no pierda tiempo haciendo esta comporbacion ya que no hay nada
			while( (j>0) && (array[j-1] > aux) ){     //(array[j-1] > aux) nos dice que si el valor a la izquierda es mayor que el numero actual, entonces hara el intercambio
				array[j] = array[j-1];		 //el numero actual es igual al numero que estaba en la izquierda, por lo que aqui se realiza el intercambio
				j--;                            //comprueba con los demas numeros que hay en la izquierda hasta que llega en la posicion 1, ya que en la posicion 0 ya no hay ningun numero a la izquierda
			}
			array[j] = aux;    //se almacenan los valores ya ordenados
		}
	
	}

}