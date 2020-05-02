package Hospital;     //crea el paquete
import java.util.Scanner;

public class Principal{

	public static void main(String[] args){
	
		int opc, des, num;

		System.out.println("¿Desea ejecutar el programa?");
        	System.out.println("Si = 1,  No = 2");
	        Scanner leer = new Scanner(System.in);
        	num = leer.nextInt();
		do{
		
			System.out.println("\nEscoja una opcion: ");
			System.out.println("1. Personal de Salud ");
			System.out.println("2. Personal Administrativo ");
			System.out.println("3. Salir ");
			opc = leer.nextInt();
			switch(opc){
				case 1: 
					do{
						System.out.println("\nPersonal de Salud: ");	
						Persona salud = new Cleaver();    //creacion del objeto
						salud.PedirDatos();    //invocacion por medio del objeto al metodo PedirDatos(superclase)
						salud.Resultado();     //invocacion por medio del objeto al metodo Resultado(superclase)

						System.out.println("\n¿Desea agregar mas personal de salud?   (Si=1/No=2) ");			
						des = leer.nextInt();
					}while(des == 1);
	
					break;

				case 2: 
					do{
						System.out.println("\nPersonal Administrativo: ");
						Persona admin = new Moss();       //creacion del objeto
						admin.PedirDatos();       //invocacion por medio del objeto al metodo PedirDatos(superclase)
						admin.Resultado();        //invocacion por medio del objeto al metodo Resultado(superclase)

						System.out.println("\n¿Desea agregar mas personal administrativo?   (Si=1/No=2) ");
						des = leer.nextInt();
					}while(des == 1);

					break;

				case 3:
					System.out.println("\nHasta pronto...  :) ");
                		    	System.exit(0);   //sale del switch
		        	        break;
			

			}

		}while(num == 1);

	}
	

}			
		