package ProgramaC;     //crea el paquete
import java.util.*;    //permite jalar los datos entre clases
public class Alumno extends Clase{      //extends denota herencia dentro de la aplicacion

	private float calificacion;
	private String actividades, matricula;

	public Alumno(String n, String s, int e, float c, String a, String m){    //creacion del constructorcon parametros de la superclase y esta clase 
		super(n, s, e);   //obtiene estos datos de la superclase
		calificacion = c;     //declaracion de variables
		actividades = a;	
		matricula = m;
   	}

	//getters
	public float getCalificacion(){
		return calificacion;
	}

	public String getActividades(){
		return actividades;
	}

	public String getMatricula(){
		return matricula;
	}

}
