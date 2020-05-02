//Sofia Omara Guerrero Angeles
//Busqueda Binaria (ejercicio guiado)

import java.util.Scanner;
import java.util.Arrays;
public class Prueba{

	public static void main(String [] args){

		Scanner leer = new Scanner(System.in);
		int tam = 0;     //tamaño del arreglo
		int aux = 0;     //aux para agregar datos al arreglo, nos permitira llenar el arreglo con numeros aleatorios
		int a, b;
		
		//Pedimos el tamaño del Arreglo
		System.out.println("\nIngrese el tamaño del arreglo: ");
		tam = leer.nextInt();
		
		int[] array = new int[tam];     //creacion del arreglo con el tamaño que digite el usuario
		
		//Se generan los numeros aleatorios en un rango de 1-100 y se llena el arreglo con dichos numeros
		for(int x=0; x<tam; x++){     //for que recorre el arreglo
			aux = (int)(Math.random()*(100-1+1)+1);    //es otra forma de llenar el arreglo con random, se coloca int al inicio por que random devuelve valores reales (double), se utilizan esos numeros, ya que el rango es de 1-100, de lo contrario, generaria aleatorios de 0-100
			array[x] = aux;     //el arreglo toma los valores del auxiliar (se llena con numeros aleatorios en un intervalo de 1-100)
			System.out.print(" "+array[x]);   //muestra el arreglo lleno con los aleatorios, separados por un espacio entre cada numero
		}
		
		//ordenamos el arreglo de manera rapida haciendo uso de los metodos de arrays (se ordena de forma ascendente por la busqueda binaria requiere que el arreglo este ordenado)
		//IMPORTANTE: si el array NO esta ordenado, nos podria dar un resultado erroneo
		System.out.println("\n");   //salto de linea
		System.out.println("\nLos elementos del Array ORDENADOS son: ");
		Arrays.sort(array);    //Arrays.sort permite ordenar de manera automatica el arreglo ascendentemente y recibe como parametro el array
		for(int x=0; x<tam; x++){     //recorre el arreglo ya ordenado ascendentemente 
			System.out.print(" "+array[x]);    //muestra el arreglo ya ordenado ascendentemente, separados los elementos por un espacio 
		}

		//Pedimos los numeros que se desea buscar
		System.out.println("\nIngrese el PRIMER numero que desea buscar: ");
		a = leer.nextInt();
		System.out.println("\nIngrese el SEGUNDO numero que desea buscar: ");
		b = leer.nextInt();

		//Implementamos la Busqueda binaria
		//Recibe como parametro el arreglo y el numero a buscar (array, num)
		/*
		En caso de encontrar el numero nos devolvera un valor entero (positivo, mayor o igual a 0), con el numero
		con la posicion que ocupa dentro del array el numero buscado, si NO se encuentra
		dentro del array, devolvera un numero negativo (menor a 0)
		*/
		int posi1 = Arrays.binarySearch(array, a);    //metodo que recibe como parametros el arreglo ordenado(array) y el numero que se buscara(num); este metodo sirve para realizar la busqueda automaticamente, binarySearch devuelve la 1era ocurrencia del elemento a buscar
		int posi2 = Arrays.binarySearch(array, b);    //metodo que recibe como parametros el arreglo ordenado(array) y el numero que se buscara(num); este metodo sirve para realizar la busqueda automaticamente, binarySearch devuelve la 1era ocurrencia del elemento a buscar
		
		//Verificamos el resultado de la busqueda binaria
		if(posi1>=0 && posi2>=0){     //si el numero a buscar se encuentra en el arreglo, regresa un valor positivo mayor o igual a 0; es decir, si se encientra el numero, la posicion retorna un numero mayor o igual que 0
			System.out.println("\nNumero: "+a+" Econtrado en la posicion: "+posi1);    //muestra en pantalla el numero que se busco (num) y la posicion en la que se encuentra (position)
			System.out.println("\nNumero: "+b+" Econtrado en la posicion: "+posi2);    //muestra en pantalla el numero que se busco (num) y la posicion en la que se encuentra (position)
		}
		else{
			System.out.println("\nNO se encontro ningun numero ");
		}	
		if(posi1<0 && posi2>=0){
			System.out.println("\nPRIMER numero NO encontrado ");
			System.out.println("\nNumero: "+b+" Econtrado en la posicion: "+posi2);    //muestra en pantalla el numero que se busco (num) y la posicion en la que se encuentra (position) 
		}
		else if(posi1>=0 && posi2<0){
			System.out.println("\nSEGUNDO numero NO encontrado ");
			System.out.println("\nNumero: "+a+" Econtrado en la posicion: "+posi1);    //muestra en pantalla el numero que se busco (num) y la posicion en la que se encuentra (position) 
		}		
		
	}
}