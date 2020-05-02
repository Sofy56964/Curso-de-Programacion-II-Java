package Herper;  //crea paquete 
import java.util.*;  //jala datos entre clases
import java.util.ArrayList;
import java.util.Scanner;
public class PersonTest{    //creacion de la clase 
	
	public static void main(String []args){
		
		int des, opc, a, num;
		String n, c, e, g, s, p;
		float ca;
		ArrayList<Estudent> study = new ArrayList<Estudent>();  //creacion del arreglo dinamico o ArrayList de la subclase estudiantes
		ArrayList<Teacher> profr = new ArrayList<Teacher>();  //creacion del arreglo dinamico o ArrayList de la subclase profesores
		Scanner leer = new Scanner(System.in);
	
			System.out.println("¿Desea ejecutar el programa?");
			System.out.println("Si = 1,  No = 2");
			num = leer.nextInt();
			do{	
				System.out.println("\nEscoja una opcion: ");
				System.out.println("1. Estudiante ");
				System.out.println("2. Profesor ");
				System.out.println("3. Salir ");
				des = leer.nextInt();
				switch(des){
					case 1:
						do{
							System.out.println("\nDigite el nombre: ");
							leer.nextLine();    //para que no de por hecho que el usuario ha escrito algo y no se brinque esta variable 
							n = leer.nextLine();
							System.out.println("Digite la licenciatura: ");
							c = leer.nextLine();
							System.out.println("Digite la edad: ");
							a = leer.nextInt();
							System.out.println("Digite el telefono: ");
							leer.nextLine();    //para que no de por hecho que el usuario ha escrito algo y no se brinque esta variable 
							p = leer.nextLine();
							System.out.println("Digite la matricula: ");
							e = leer.nextLine();
							System.out.println("Digite la calificacion: ");
							ca = leer.nextFloat();
							System.out.println("Digite el grupo: ");
							leer.nextLine();    //para que no de por hecho que el usuario ha escrito algo y no se brinque esta variable 
							g = leer.nextLine();
						
							study.add(new Estudent(n, c, a, p, e, ca, g));   //el ArrayList de estudiantes toma los valores ingresados por el usuario y los agregra al arreglo dinamico
							System.out.println("\n¿Desea agregar mas estudiantes?  (Si=1/No=2)");
							des = leer.nextInt();
						}while(des==1);    //se va a repetir si la desicion es si

						for(Estudent estudent: study){      //for mejorado que recorre el ArrayList de estudiantes
							System.out.println("\nNombre: "+estudent.getName()+ "\nLicenciatura: "+estudent.getCareer()+ "\nEdad: "+estudent.getAge()+ "\nTelefono: "+estudent.getPhone()+ "\nMatricula: "+estudent.getEnrollment()+ "\nCalificacion obtenida: "+estudent.getCalif()+ "\nGrupo: "+estudent.getGroup() );
							//el system.out imprime los datos que ingreso el usuario y se guardaron en el ArrayList concatenados con las palabras entre ""
						}					
						break;


					case 2:
						do{
							System.out.println("\nDigite el nombre: ");
							leer.nextLine();    //para que no de por hecho que el usuario ha escrito algo y no se brinque esta variable 
							n = leer.nextLine();
							System.out.println("Digite la licenciatura: ");
							c = leer.nextLine();
							System.out.println("Digite la edad: ");
							a = leer.nextInt();
							System.out.println("Digite el telefono: ");
							leer.nextLine();    //para que no de por hecho que el usuario ha escrito algo y no se brinque esta variable 
							p = leer.nextLine();
							System.out.println("Digite la materia que imparte: ");    
							s = leer.nextLine();
						
							profr.add(new Teacher(n, c, a, p, s));   //el ArrayList de profesores toma los valores ingresados por el usuario y los agregra al arreglo dinamico
							System.out.println("\n¿Desea agregar mas profesores?  (Si/No=2)");
							des = leer.nextInt();
						}while(des==1);    //se va a repetir si la desicion es si
					
						for(Teacher teacher: profr){     //for mejorado que recorre el ArrayList de profesores
							System.out.println("\nNombre: "+teacher.getName()+ "\nLicenciatura: "+teacher.getCareer()+ "\nEdad: "+teacher.getAge()+ "\nTelefono: "+teacher.getPhone()+ "\nMateria que imparte: "+teacher.getSubject() );
							//el system.out imprime los datos que ingreso el usuario y se guardaron en el ArrayList concatenados con las palabras entre ""
						}
						break;

				
					case 3: 
						System.out.println("\nHasta pronto...");
						System.exit(0);   //sale del switch
						break;				
	
				}	
			}while(num==1);

	}
}

		
		
		

