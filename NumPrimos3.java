//Programacion II
//Sofia Omara Guerrero Angeles
//Logica ejercicio 4

import java.util.Scanner;
import java.util.ArrayList;
public class NumPrimos3{

	public static void main(String[] args){
		
		Scanner leer = new Scanner(System.in);
		int tam, i, j, aux;
		int cont=0;  //contador que nos permitira identificar y almacenar los numeros y primos
		
		ArrayList <Integer> array = new ArrayList <Integer>();  //Creacion de ArrayList vacio de tipo entero(se coloca integer por que los arraylist trabajan con obj, int!=obj)
		ArrayList <Integer> pares = new ArrayList <Integer>();    //Creacion de ArrayList vacio de tipo entero que almacenara los numeros pares
		ArrayList <Integer> primos = new ArrayList <Integer>();   //Creacion de ArrayList vacio de tipo entero que almacenara los numeros primos (numeros divisibles entre si mismos y entre la unidad)
		
		//pedimos el tamaño al usuario
		System.out.println("\nIngrese el tamaño del arreglo: ");
		tam = leer.nextInt();

		//Generamos los numeros aleatorios en el intervalo de 1-200
		System.out.println("\nLos elementos del arreglo son: ");
		for(i=0; i<tam; i++){    //for que recorre el arreglo
			aux = (int)(Math.random()*(200-1+1)+1);	  //es otra forma de llenar el arreglo con random, se coloca int al inicio por que random devuelve valores reales (double), se utiliza el parametro ((200-1+1)+1), ya que el rango es de 1-200, de lo contrario, generaria aleatorios de 0-200
			array.add(aux);   //la funcion add Inserta el elemento especificado en la posicion especificada en esta lista, es decir, rellena el arreglo vacio con numeros aleatorios en el intervalo especificado (1-200)
			System.out.print(" "+array.get(i));  //muestra el arreglo lleno, get devuelve el elemento en la posicion especificada, en este caso el iterador ya que debe mostrar todos los elementos de la lista
		}
		System.out.println();    //salto de linea

		//Se realiza el analisis para clasificar los numeros primos
		for(i=0; i<tam; i++){     //for que recorre el arreglo original(array) y toma los valores de los elementos en la posicion especificada y no se repite(no cambia de posicion) hasta que el for anidado (j) termine sus ejecuciones
                                                            //la funcion get(), Devuelve el elemento en la posicion especificada en esta lista, entonces devolvera los valores de i, por ejemplo: array.get(0)=4, devolvera el 4					
			if(array.get(i)%2 == 0){
				pares.add(array.get(i));
			}else{
				j=1; 
				while(j<=array.get(i)){
					if(array.get(i)%j == 0){
						cont ++;
					}
					j++;
				}
				if(cont<=2){
					primos.add(array.get(i));
				}
			}
		}

		//Mostramos los ArrayList con numeros primos y pares:
		System.out.println("\nLos Numeros PARES son: ");
		for(i=0; i<pares.size(); i++){    //for que recorre el arreglo que almacena los numeros pares del ArrayList, size() devuelve el numero de elementos en la lista (en este caso, la cantidad de numeros pares)
			System.out.print(" "+pares.get(i));   //muestra el arreglo con los numeros pares separados por un espacio
		}

		System.out.println("\nLos numeros PRIMOS son: ");
		for(j=0; j<primos.size(); j++){    //for que recorre el arreglo que almacena los numeros primos del ArrayList, size() devuelve el numero de elementos en la lista (en este caso, la cantidad de numeros primos)
			System.out.print(" "+primos.get(j));   //muestra el arreglo con los numeros primos separados por un espacio
			
		}

	}
}