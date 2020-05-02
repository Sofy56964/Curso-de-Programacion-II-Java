package Hospital;   //crea el paquete
import java.util.Scanner;

public class Moss extends Persona{      //la palabra extends denota herencia en la aplicacion

	Scanner leer = new Scanner(System.in);

	@Override     //para sobreescribir el metodo de la clase padre con el comportamiento de cada subclase (va antes del metodo que se va a sobreescribir)

	public void Resultado(){
		System.out.println("Introduzca el numero que considere correcto a cada pregunta...");
		System.out.print("\nSe le ha asignado un puesto en una gran empresa. La mejor forma de establecer relaciones amistosas y cordiales con sus nuevos compañeros será: ");
		System.out.println("\n1. Evitando tomar nota de los errores en que ellos incurran. ");
		System.out.println("2. Hablando bien de ellos al jefe. ");
		System.out.println("3. Mostrando interés en el trabajo de ellos. ");
		System.out.println("4. Pidiéndoles le permitan hacer los trabajos que usted puede hacer mejor. ");
		c1 = leer. nextInt();
		System.out.println();    //salto de linea

		System.out.print("\nTiene usted un empleado muy eficiente, pero que constantemente se queja del trabajo; sus quejas producen mal efecto en los demás empleados. Lo mejor será: ");
		System.out.println("\n1. Pedir a los demás empleados que traten de no hacer caso. ");
		System.out.println("2. Averiguar la causa de esa actitud y procurar su modificación. ");
		System.out.println("3. Cambiarlo de departamento donde quede a cargo de otro jefe. ");
		System.out.println("4. Permitirle planear lo más posible acerca de su trabajo. ");
		c2 = leer.nextInt();
		System.out.println();    //salto de linea

		System.out.print("\nUn empleado de 50 años de edad que ha sido leal a la empresa durante 25 años, se queja de exceso de trabajo, lo mejor sería: ");
		System.out.println("\n1. Decirle que vuelva a su trabajo o se expone a que lo despidan. ");
		System.out.println("2. Despedirlo substituyéndolo por alguien más joven. ");
		System.out.println("3. Darle un aumento de sueldo que evite que continúe quejándose. ");
		System.out.println("4. Aminorar su trabajo. ");
		c3 = leer.nextInt();
		System.out.println();    //salto de linea

		System.out.print("\nUno de sus socios, sin autoridad sobre usted, le ordena algo en forma distinta de lo que planeaba, ¿Qué haría usted? ");
		System.out.println("\n1. Acatar la orden y no armar mayor revuelo. ");
		System.out.println("2. Ignorar las indicaciones y hacer según usted había planeado. ");
		System.out.println("3. Decirle que éste es asunto que no le interesa y que usted hará las cosas a su modo. ");
		System.out.println("4. Decirle que lo haga él mismo. ");
		c4 = leer.nextInt();
		System.out.println();    //salto de linea

		System.out.print("\nUsted visita a un amigo íntimo que ha estado enfermo por algún tiempo, lo mejor sería: ");
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
	
		
		 
		
		 
		