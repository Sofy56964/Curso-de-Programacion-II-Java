package ProgramaC2;   //crea el paquete 
import  java.util.*;    //jala datos entre clases
import java.util.ArrayList;
import java.util.Scanner;
public class PrincipalC{     //creacion de la clase

	public static void main(String[] args){
		
		String n, s, a, m, ma, dis, mat, i;
		int e, al, opc, j, total, act, x;	
		int cont = 0;    //inicializa un contador en 0 numero de reprobados
		int no = 0;     //inicializa segundo contador en 0 si el profesor esta disponible
		int acts = 0;   //inicializa tercer contador en 0 actividades extraclase 
		float c;
		boolean activ, dispo;   //variable booleana para convertir el caracter de si o no en booleana 
		ArrayList<Alumno> study = new ArrayList<Alumno>();   //creacion del arreglo dinamico o ArrayList de la subclase Alumno 
		ArrayList<Profesor> profr = new ArrayList<Profesor>();   //creacion del arreglo dinamico o ArrayList de la subclase Profesor
		Scanner leer = new Scanner(System.in);

		System.out.println("¿Desea ejecutar el programa? ");
		System.out.println(" Si = 1,   No = 2");
		opc= leer.nextInt();
		do{
			System.out.println("¿Cuantos alumnos? ");
			x = leer.nextInt();
			for(j=0; j<=x; j++){
				System.out.println("\nDigite el nombre del alumno: ");
				n = leer.nextLine();
				System.out.println("Digite el sexo: ");
				s = leer.nextLine();
				System.out.println("Digite la edad: ");
				e = leer.nextInt();
				System.out.println("Digite la calificacion obtenida: ");
				c = leer.nextFloat();
				System.out.println("Digite si realizo actividades:   V = SI,   F = NO");
				a = leer.nextLine();
				if(a == V || a == v){
		                    	activ = true;
                		}		
				System.out.println("Digite la matricula del alumno: ");
				m = leer.nextLine();

				study.add(new Alumno(n, s, e, c, a, m));    //el ArrayList de alumno toma los valores ingresados por el usuario y los agregra al arreglo dinamico
			}//el cilo for se va a repetir hasta cumplir el numero de estudiantes que el usuario desee	
			
			for(Alumno alumno: study){   //for mejorado que recorre el ArrayList de alumno
				System.out.println("\nNombre del alumno: "+alumno.getNombre()+ "\nSexo: "+alumno.getSexo()+ "\nEdad: "+alumno.getEdad()+ "\nCalificacion obtenida: "+alumno.getCalificacion()+"\nActividades: "+alumno.getActividades()+ "\nMatricula: "+alumno.getMatricula() );
				//el system.out imprime los datos que ingreso el usuario y se guardaron en el ArrayList concatenados con las palabras entre ""
				if(c>=6.0){
					cont ++;
				}
				//if(a==Si || a==si){
					//acts ++;
				//}
			}

			//pedir datos de profesor
			System.out.println("\nDigite el nombre del profesor: ");
			n = leer.nextLine();
			System.out.println("Digite el sexo: ");
			s = leer.nextLine();
			System.out.println("Digite la edad: ");
			e = leer.nextInt();
			System.out.println("Digite la materia que imparte: ");
			ma = leer.nextLine();
			System.out.println("Digite si esta disponible: ");
			dis = leer.nextLine();
		
			profr.add(new Profesor(n, s, e, ma, dis));    //el ArrayList de profesor toma los valores ingresados por el usuario y los agregra al arreglo dinamico
			for(Profesor profesor: profr){   //for mejorado que recorre el ArrayList de profesor
				System.out.println("\nNombre del profesor: "+profesor.getNombre()+ "\nSexo: "+profesor.getSexo()+ "\nEdad: "+profesor.getEdad()+ "\nMateria que imparte: "+profesor.getMateria()+"\nDisponibilidad: "+profesor.getDisponible() );
				//el system.out imprime los datos que ingreso el usuario y se guardaron en el ArrayList concatenados con las palabras entre ""
				//if(dis==Si || dis== si){
					//no ++;
				//}
			}

			
			//Mostrar y pedir datos del salon
			System.out.println("\nDigite los datos del salon: ");
			System.out.println("Ingrese el id del salon: ");
			i = leer.nextLine();
			total = (x*30)/100;

			if(x>cont){
				System.out.println("Es posible abrir la clase por que hay mas de 30% de alumnos que puede cursar la materia");
			}
			else{
				System.out.println("No es posible abrir la clase por que no esta el 30% minimo de alumnos requeridos :( ");
			}

			/* 
			act = x-acts;
			System.out.println("El numero de alumnos que estan inscritos pero no asistiran por actividades extracurriculares son: "+act);
			
			if(dis ==No || dis == no){
				System.out.println("La clase no puede ser impartida por falta de disponibiidad del profesor ");
			}
			
			else{
				System.out.println("el aula puede ser abierta :) ");
			}
			*/
			
		}while(opc==1);
	}
}



			
			
			
			
			
			
				
				 
				 
			  
				
							 
			
		
