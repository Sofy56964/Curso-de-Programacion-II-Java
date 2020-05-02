package Orden;    //crea el paquete

public class Seleccion extends Ordenamiento{         //la palabra extends denota herencia en la aplicacion

	@Override     //para sobreescribir el metodo de la clase padre con el comportamiento de cada subclase (va antes del metodo que se va a sobreescribir)
	
	public void TipoOrdenamiento(){       //metodo que permitira hacer el ordenamiento de seleccion
		//Algoritmo de Ordenamiento por Seleccion	
		for(i=0; i<tam; i++){      //for que recorre el arreglo
			min = i;          //como aun no se ha revisado todo el arreglo, suponemos que la primera posicion es valor es el valor minimo
			for(j=i+1; j<tam; j++){     //se coloca j=i+1, porque ya se le indico que el valor menor es la primera posicion, entonces recorrera el arreglo a partir de la segunda posicion
				if(array[j] < array[min]){      //como j fue inicializado en la segunda posicion, va a comprobar si ese valor es menor a la primera posicion del arreglo(posicion i), y asi sucesivamente ira comparando una pocision(j) y la primera posicion(i) hasta encontrar el valor minimo de todo el arreglo
					min = j;     //en caso de que se cumpla la condicion, entonces el valor de la poscion j es menor a la posicion i, y hace el cambio de posicion, es decir, el valor menor(j) ahora se encuentra en la posicion del valor mayor(i)
				}     //el for y el if, determinan cual es el menor valor del arreglo
			}
			//intercambio de posciones de forma ascendente:
			aux =array[i];     //el auxiliar, toma los valores del array[i] (los cuales estan desordenados)
			array[i] = array[min];     //el array[i] toma los valores del array[min], los cuales ya estan siendo ordenados por medio del for y el if anterior
			array[min] = aux;     //por ultimo el array[min] ahora es igual al auxiliar, lo cual nos dice que el arreglo desordenado ahora esta ordenado
		}
	}

}