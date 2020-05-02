package Autos;  //crea paquete 
import java.util.*;  //jala datos entre clases
import java.util.ArrayList;
import java.util.Scanner;
public class AutosTest{    //creacion de la clase 
	
	public static void main(String []args){
		
		String t, c, ma, co, s, n, cl, i;
		float cap;
		double cos, desc; 
		int m, ci, e, p, pu, pa, cil, num, x;		

		ArrayList<Carga> load = new ArrayList<Carga>();  //creacion del arreglo dinamico o ArrayList de la subclase carga
		ArrayList<Coche> car = new ArrayList<Coche>();  //creacion del arreglo dinamico o ArrayList de la subclase coche
		ArrayList<Picop> hindi = new ArrayList<Picop>();  //creacion del arreglo dinamico o ArrayList de la subclase picop
		ArrayList<Suv> uzbeck = new ArrayList<Suv>();  //creacion del arreglo dinamico o ArrayList de la subclase suv
		
		Scanner leer = new Scanner(System.in);
	
			System.out.println("¿Desea ejecutar el programa?");
			System.out.println("Si = 1,  No = 2");
			num = leer.nextInt();
			do{	
				System.out.println("\nEscoja una opcion: ");
				System.out.println("1. Carga ");
				System.out.println("2. Coche ");
				System.out.println("3. Picop ");
				System.out.println(" 4. Suv ");
				System.out.println(" 5. Salir ");
				x = leer.nextInt();
				switch(x){
					case 1:
						do{
							System.out.println("\nDigite el tipo de vehiculo: ");
							leer.nextLine();    //para que no de por hecho que el usuario ha escrito algo y no se brinque esta variable 
							t = leer.nextLine();
							System.out.println("Digite el comprador: ");
							c = leer.nextLine();
							System.out.println("Digite la marca: ");
							ma = leer.nextLine();
							System.out.println("Digite el costo: ");
							leer.nextLine();    //para que no de por hecho que el usuario ha escrito algo y no se brinque esta variable 
							cos = leer.nextDouble();
							System.out.println("Digite el modelo: ");
							leer.nextLine();    //para que no de por hecho que el usuario ha escrito algo y no se brinque esta variable 
							m = leer.nextInt();
							System.out.println("Digite el numero de cilindros: ");
							leer.nextLine();    //para que no de por hecho que el usuario ha escrito algo y no se brinque esta variable
							ci = leer.nextInt();
							System.out.println("Digite el numero de ejes: ");
							leer.nextLine();    //para que no de por hecho que el usuario ha escrito algo y no se brinque esta variable 
							e = leer.nextInt();
							System.out.println("Digite la capacidad de carga total: ");
							cap = leer.nextFloat();
						
							load.add(new Carga(t, c, ma, cos, m, ci, e, cap));   //el ArrayList de carga toma los valores ingresados por el usuario y los agregra al arreglo dinamico
							//if(m==2019){
								//System.out.println(carga.getCosto() );
							//}
								
							System.out.println("\n¿Desea agregar mas vehiculos de carga?  (Si=1/No=2)");
							x = leer.nextInt();
						}while(x==1);    //se va a repetir si la desicion es si

						for(Carga carga: load){      //for mejorado que recorre el ArrayList de carga
							System.out.println("\nTipo del vehiculo: "+carga.getTipo()+ "\nComprador: "+carga.getComprador()+ "\nMarca: "+carga.getMarca()+ "\nCosto: "+carga.getCosto()+ "\nModelo: "+carga.getModelo()+ "\nNumero de cilindros: "+carga.getCilindros()+ "\nNumero de ejes: "+carga.getEjes()+ "\nCapacidad total de carga: "+carga.getCapacidad() );
							//el system.out imprime los datos que ingreso el usuario y se guardaron en el ArrayList concatenados con las palabras entre ""
						}					
						break;


					case 2:
						do{
							System.out.println("\nDigite el tipo de vehiculo: ");
							leer.nextLine();    //para que no de por hecho que el usuario ha escrito algo y no se brinque esta variable 
							t = leer.nextLine();
							System.out.println("Digite el comprador: ");
							c = leer.nextLine();
							System.out.println("Digite la marca: ");
							ma = leer.nextLine();
							System.out.println("Digite el costo: ");
							leer.nextLine();    //para que no de por hecho que el usuario ha escrito algo y no se brinque esta variable 
							cos = leer.nextDouble();
							System.out.println("Digite el modelo: ");
							leer.nextLine();    //para que no de por hecho que el usuario ha escrito algo y no se brinque esta variable
							m = leer.nextInt();
							System.out.println("\nDigite el numero de pasajeros: ");
							leer.nextLine();    //para que no de por hecho que el usuario ha escrito algo y no se brinque esta variable 
							p = leer.nextInt();
							System.out.println("Digite el numero de puertas: ");
							pu = leer.nextInt();
							System.out.println("Digite el color: ");
							co = leer.nextLine();
							System.out.println("Digite la serie del vehiculo: ");
							leer.nextLine();    //para que no de por hecho que el usuario ha escrito algo y no se brinque esta variable 
							s = leer.nextLine();
						
							car.add(new Coche(t, c, ma, cos, m, p, pu, co, s));   //el ArrayList de coche toma los valores ingresados por el usuario y los agregra al arreglo dinamico
							System.out.println("\n¿Desea agregar mas coches?  (Si/No=2)");
							x = leer.nextInt();
						}while(x==1);    //se va a repetir si la desicion es si
					
						for(Coche coche: car){     //for mejorado que recorre el ArrayList de profesores
							System.out.println("\nTipo del vehiculo: "+coche.getTipo()+ "\nComprador: "+coche.getComprador()+ "\nMarca: "+coche.getMarca()+ "\nCosto: "+coche.getCosto()+ "\nModelo: "+coche.getModelo()+ "Numero de pasajeros: "+coche.getPasajeros()+ "Numero de puertas: "+coche.getPuertas()+ "Color: "+coche.getColor()+ "Serie: "+coche.getSerie() );
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