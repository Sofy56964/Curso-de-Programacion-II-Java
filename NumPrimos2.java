//Programacion II
//Sofia Omara Guerrero Angeles
//Logica ejercicio 4

import java.util.Scanner;
import java.util.ArrayList;
public class NumPrimos{

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
		for(i=0; i<tam; i++){     //for que recorre el arreglo original(array) y toma los valores de los elementos en la posicion especificada 
                                                                                     //la funcion get(), Devuelve el elemento en la posicion especificada en esta lista, entonces devolvera los valores de i, por ejemplo: array.get(0)=4, devolvera el 4					
			if(array.get(i)%1==0 && array.get(i)%array.get(i)==0){      //para que un numero sea primo debe cumplir dos condiciones: que sea divisible por si mismo y por la unidad. Este if compara si cumple con ambas condiciones, si el modulo(residuo de la division) entre el numero en la pos i y la unidad =0, y si el modulo(%) entre el valor de la pos i y entre si mismo (el mismo numero en la misma posicion) =0 
				primos.add(array.get(i));    //si se cumple la condicion, el ArrayList "primos" se le agregan (add agrega los elementos en la posicion especificada) los numeros que son primos (get (i) devuelve el valor en la posicion especificada, por lo que esos valores en esa posicion son los numeros primos dentro del ArrayList)
			}	
		   	if(array.get(i)%2==0){    //si el modulo entre el elemento en la posicon i y dos es 0, entonces es un numero par (get devuelve el valor en la posicion especificada, al colocar el iterador como la posicion especificada, devolvera todos los elementos del ArrayList y evaluara si son pares)
				pares.add(array.get(i));     //add Inserta el elemento especificado en la posicion especificada en esta lista, get devuelve el valor en la posicion especificada, por lo que guarda los numeros pares dentro del arreglo
			}
		}

		
		//Mostramos los ArrayList con numeros primos y pares:
		System.out.println("\nLos Numeros PARES son: ");
		for(j=0; j<pares.size(); j++){    //for que recorre el arreglo que almacena los numeros pares del ArrayList, size() devuelve el numero de elementos en la lista (en este caso, la cantidad de numeros pares, es similar a .length en los arreglos)
			System.out.print(" "+pares.get(j));   //muestra el arreglo con los numeros pares separados por un espacio
		}

		System.out.println("\nLos numeros PRIMOS son: ");
		for(j=0; j<primos.size(); j++){    //for que recorre el arreglo que almacena los numeros primos del ArrayList, size() devuelve el numero de elementos en la lista (en este caso, la cantidad de numeros primos)
			System.out.print(" "+primos.get(j));   //muestra el arreglo con los numeros primos separados por un espacio
		}

	}
}