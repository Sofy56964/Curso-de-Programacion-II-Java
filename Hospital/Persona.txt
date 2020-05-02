//Sofia Omara Guerrero Angeles
//Contratacion del Hospital, usando Herencia y Polimorfismo

package Hospital;   //crea el paquete
import java.util.Scanner;    //permite la entrada de teclado

public abstract class Persona{	     //abstract para que se pueda reescribir en las demas clases

	protected String nombre, fecha, salario, estudios;     //para que se puedan usar en diferentes clases se usa protected
	protected int edad, c1, c2, c3, c4, c5, total; 

	Scanner leer = new Scanner(System.in); 
	
	public void PedirDatos(){      //metodo para solicitar los datos
		System.out.print("Nombre: ");
		nombre = leer.nextLine();
		System.out.print("Fecha de nacimiento: ");
		fecha = leer.nextLine();
		System.out.print("Edad: ");	
		edad = leer.nextInt();
		System.out.print("Grado de estudios: ");
		leer.nextLine();    //para que no de por hecho que el usuario ha escrito algo y no se brinque esta variable 
		estudios = leer.nextLine();
		System.out.print("Salario al que aspira: ");
		salario = leer.nextLine();
		System.out.println();    //salto de linea
	}

	public abstract void Resultado();       //metodo que dice el resultado del aspirante y es abstract porque a este metodo se le va a aplicar el polimorfismo

}
		
	

	

	