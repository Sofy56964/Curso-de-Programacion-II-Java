package Hospital;   //crea el paquete
import java.util.Scanner;

public class Moss extends Persona{      //la palabra extends denota herencia en la aplicacion

	Scanner leer = new Scanner(System.in);

	@Override     //para sobreescribir el metodo de la clase padre con el comportamiento de cada subclase (va antes del metodo que se va a sobreescribir)

	public void Resultado(){
		System.out.println("Introduzca el numero que considere correcto a cada pregunta...");
		System.out.print("\nSe le ha asignado un puesto en una gran empresa. La mejor forma de establecer relaciones amistosas y cordiales con sus nuevos compa�eros ser�: ");
		System.out.println("\n1. Evitando tomar nota de los errores en que ellos incurran. ");
		System.out.println("2. Hablando bien de ellos al jefe. ");
		System.out.println("3. Mostrando inter�s en el trabajo de ellos. ");
		System.out.println("4. Pidi�ndoles le permitan hacer los trabajos que usted puede hacer mejor. ");
		c1 = leer. nextInt();
		System.out.println();    //salto de linea

		System.out.print("\nTiene usted un empleado muy eficiente, pero que constantemente se queja del trabajo; sus quejas producen mal efecto en los dem�s empleados. Lo mejor ser�: ");
		System.out.println("\n1. Pedir a los dem�s empleados que traten de no hacer caso. ");
		System.out.println("2. Averiguar la causa de esa actitud y procurar su modificaci�n. ");
		System.out.println("3. Cambiarlo de departamento donde quede a cargo de otro jefe. ");
		System.out.println("4. Permitirle planear lo m�s posible acerca de su trabajo. ");
		c2 = leer.nextInt();
		System.out.println();    //salto de linea

		System.out.print("\nUn empleado de 50 a�os de edad que ha sido leal a la empresa durante 25 a�os, se queja de exceso de trabajo, lo mejor ser�a: ");
		System.out.println("\n1. Decirle que vuelva a su trabajo o se expone a que lo despidan. ");
		System.out.println("2. Despedirlo substituy�ndolo por alguien m�s joven. ");
		System.out.println("3. Darle un aumento de sueldo que evite que contin�e quej�ndose. ");
		System.out.println("4. Aminorar su trabajo. ");
		c3 = leer.nextInt();
		System.out.println();    //salto de linea

		System.out.print("\nUno de sus socios, sin autoridad sobre usted, le ordena algo en forma distinta de lo que planeaba, �Qu� har�a usted? ");
		System.out.println("\n1. Acatar la orden y no armar mayor revuelo. ");
		System.out.println("2. Ignorar las indicaciones y hacer seg�n usted hab�a planeado. ");
		System.out.println("3. Decirle que �ste es asunto que no le interesa y que usted har� las cosas a su modo. ");
		System.out.println("4. Decirle que lo haga �l mismo. ");
		c4 = leer.nextInt();
		System.out.println();    //salto de linea

		System.out.print("\nUsted visita a un amigo �ntimo que ha estado enfermo por alg�n tiempo, lo mejor ser�a: ");
		System.out.println("\n1. Platicarle sus diversiones recientes. ");
		System.out.println("2. Platicarle nuevas referentes a amigos mutuos. ");	
		System.out.println("3. Comentar su enfermedad. ");
		System.out.println("4. Enfatizar lo mucho que le apena verle enfermo. ");
		c5 = leer.nextInt();
		System.out.println();    //salto de linea

		total = c1+c2+c3+c4+c5; 
	
		if(total > 15){
			System.out.println("ACEPTADO en la vacante :) ");
		}

		else{
			System.out.println("RECHAZADO en la vacante :( ");
		}
	}

}
	
		
		 
		
		 
		