package Orden;     //crea el paquete
import java.util.Scanner;

public class Principal{

	public static void main(String[] args){
		
		Scanner leer = new Scanner(System.in);
		int opc, des, num;

		System.out.println("\n¿Desea ejecutar el programa?  (Si = 1,  No = 2) ");
		num = leer.nextInt();
		do{
			System.out.println("\n***********METODOS DE ORDENAMIENTO ;)*********** ");
			System.out.println("\nEscoja una opcion: ");
			System.out.println("1. Burbuja ");
			System.out.println("2. Seleccion ");
			System.out.println("3. Insercion ");
			System.out.println("4. Salir ");
			opc = leer.nextInt();
			switch(opc){
				case 1:
					System.out.println("\nORDENAMIENTO POR METODO DE INTERCAMBIO O BURBUJA :)");	
					Ordenamiento burb = new Burbuja();     //creacion del objeto
					burb.Arreglo();     //invocacion del metodo construir arreglo
					burb.TipoOrdenamiento();    //invocacion del metodo que seleccione el usuario
					burb.Mostrar();     //invocacion del metodo para mostrar el arreglo ordenado ascendentemente y descendentemente
					break;

				case 2: 
					System.out.println("\nORDENAMIENTO POR SELECCION :) ");
					Ordenamiento sel = new Seleccion();     //creacion del objeto
					sel.Arreglo();     //invocacion del metodo construir arreglo
					sel.TipoOrdenamiento();   //invocacion del metodo que seleccione el usuario
					sel.Mostrar();     //invocacion del metodo para mostrar el arreglo ordenado ascendentemente y descendentemente
					break;
			
				case 3: 
					System.out.println("\nORDENAMIENTO POR INSERCION :) ");
					Ordenamiento ins = new Insercion();     //creacion del objeto
					ins.Arreglo();     //invocacion del metodo construir arreglo
					ins.TipoOrdenamiento();     //invocacion del metodo que seleccione el usuario
					ins.Mostrar();      //invocacion del metodo para mostrar el arreglo ordenado ascendentemente y descendentemente
					break;

				case 4:
					System.out.println("\nHasta pronto...  :) ");
                		    	System.exit(0);   //sale del switch
		        	        break;

			}

		}while(num == 1);
	
	}
}

					

		