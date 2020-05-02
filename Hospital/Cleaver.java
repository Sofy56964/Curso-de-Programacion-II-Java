package Hospital;    //crea el paquete
import java.util.Scanner;

public class Cleaver extends Persona{      //la palabra extends denota herencia en la aplicacion	

	Scanner leer = new Scanner(System.in);

	@Override     //para sobreescribir el metodo de la clase padre con el comportamiento de cada subclase (va antes del metodo que se va a sobreescribir)

	public void Resultado(){
		System.out.println("Seleccione de cada conjuto la palabra que mas lo describa...");
		System.out.print("\nCONJUNTO 1: ");
		System.out.println("\n1. Persuasivo ");
		System.out.println("2. Gentil ");
		System.out.println("3. Humilde ");
		System.out.println("4. Original ");
		c1 = leer.nextInt();
		System.out.println();    //salto de linea 

		System.out.print("\nCONJUNTO 2: ");
		System.out.println("\n1. Confiado ");
		System.out.println("2. Simpatizador ");
		System.out.println("3. Tolerante ");
		System.out.println("4. Afirmativo ");
		c2 = leer.nextInt();
		System.out.println();   //salto de linea

		System.out.print("\nCONJUNTO 3: ");
		System.out.println("\n1. Obediente ");
		System.out.println("2. Quisquilloso ");
		System.out.println("3. Inconquistable ");
		System.out.println("4. Jugueton ");
		c3 = leer.nextInt();
		System.out.println();    //salto de linea

		System.out.print("\nCONJUNTO 4: ");
		System.out.println("\n1. Respetuoso ");
		System.out.println("2. Emprendedor ");
		System.out.println("3. Optimista ");
		System.out.println("4. Servicial ");
		c4 = leer.nextInt();
		System.out.println();    //salto de linea

		System.out.print("\nCONJUNTO 5: ");
		System.out.println("\n1. Ecuanime ");
		System.out.println("2. Preciso ");
		System.out.println("3. Nervioso ");
		System.out.println("4. Jovial ");
		c5 = leer.nextInt();
		System.out.println();    //salto de linea

		total = c1+c2+c3+c4+c5; 

		if(total < 10){
			System.out.println("ACEPTADO en la vacante :) ");
		}

		else{
			System.out.println("RECHAZADO en la vacante :( ");
		}
	}

}
		
	
		
		

