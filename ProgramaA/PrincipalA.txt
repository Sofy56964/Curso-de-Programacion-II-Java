package ProgramaA;    //crea paquete

import java.util.Scanner;
public class PrincipalA{
    public static void main(String[] args){

        Automovil a = new Automovil();   //creacion del objeto 
        a.pedirDatos();    //invoca el metodo pedirDatos
	System.out.println();   //salto de linea
	
	System.out.println("El vehiculo "+a.getMarca() + " con serie "+a.getSerie() + " manejado por el propietario "+a.getNombre() + " tiene "+a.getKm() + " kilometros"); 
        
	System.out.println();   //salto de linea
	
	Automovil b = new Automovil();   //creacion del segundo objeto
	b.pedirDatos();    //invoca el metodo pedirDatos

	System.out.println();    //salto de linea
	
	Automovil c = new Automovil();   //creacion del tercer objeto
	c.pedirDatos();    //invoca el metodo pedirDatos

	System.out.println();  //salto de linea

	if( b.getKm() > c.getKm() ){
		System.out.println("El PRIMER VEHICULO tiene MAS KM RECORRIDOS que el SEGUNDO VEHICULO");
	}
	else{
		System.out.println("El SEGUNDO VEHICULO tiene MAS KM RECORRIDOS que el PRIMER VEHICULO");	
	}
	
    }
}  
        




    
