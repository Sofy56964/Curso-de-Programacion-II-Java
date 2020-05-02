package ProgramaC;   //crea paquete 
import java.util.*;   //permite jalar datos entre clases
public class Profesor extends Clase{    //extends denota herencia dentro de la aplicacion
	
	private String materia, disponible;
	
	public Profesor(String n, String s, int e, String ma, String dis){    //creacion del constructorcon parametros de la superclase y esta clase 
		super(n, s, e);   //obtiene estos datos de la superclase
		materia = ma;     //declaracion de las variables
		disponible = dis;
	}

	//getters
	public String getMateria(){
		return materia;
	}

	public  String getDisponible(){
		return disponible;
	}

}