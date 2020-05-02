//Sofia Omara Guerrero Angeles
//Metodos de Ordenamiento (Seleccion, Burbuja y Insercion)

package Orden;    //crea el paquete
import java.util.Scanner;    //permite la entrada de teclado
import java.util.Random;     //permite usar numeros aleatorios

public abstract class Ordenamiento{        //abstract para que se pueda reescribir en las demas clases

	protected int tam, i, j, aux, min;       //para que se puedan usar en diferentes clases se usa protected
	protected int array[];           //declaracion y creacion del arreglo de tipo protected

	Scanner leer = new Scanner(System.in);
	Random r = new Random();

	public void Arreglo(){       //metodo para solicitar el tamaño del arreglo y llenarlo
		System.out.println("\nIngrese el tamaño del arreglo: ");
		tam = leer.nextInt();

		array = new int[tam];     //el arreglo toma el tamaño que digite el usuario
		for(i=0; i<tam; i++){
			array[i] = r.nextInt(100);     //el arreglo se llena con numeros aleatorios hasta 100
		}

		System.out.println("\nEl arreglo es: ");
		for(i=0; i<tam; i++){        //for que recorre el arreglo
			System.out.print(" "+array[i]);       //muestra el arreglo posicion por posicion, es decir, muestra todo el arreglo separados los valores por un espacio
		}
		System.out.println();    //salto de linea
	}//llave metodo Arreglo


	public abstract void TipoOrdenamiento();       //metodo para utilizar el ordenamiento que el usuario digite, es abstract porque a este metodo se le va a aplicar el polimorfismo


	public void Mostrar(){          //metodo para mostrar el arreglo ordenado ascendentemente y descendentemente
        	System.out.println("\nEl arreglo en forma ASCENDENTE es: ");	
		for(i=0; i<tam; i++){    //recorre el arreglo ya ordenado de menor a mayor
			System.out.print(" "+array[i]);     //imprime el arreglo ya ordenado de menor a mayor
		}
	
		System.out.println();     //salto de linea

		System.out.println("\nEl arreglo en forma DESCENDENTE es: ");
		for(i=tam-1; i>=0; i--){     //recorre el arreglo ya ordenado, pero desde el valor mayor al valor menor
			System.out.print(" "+array[i]);      //imprime el arreglo ya ordenado de mayor a menor
		}
		
		System.out.println();    //salto de linea

	}//llave metodo TipoOrdenamiento

}//llave de la clase
		
		