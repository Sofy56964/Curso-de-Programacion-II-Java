package Herper;
import java.util.*;   //permite jalar datos entre las clases
public class Estudent extends Person{    //extends denota herencia dentro de la aplicacion 

	private float calif;
	private String group, enrollment;

	public Estudent(String n, String c, int a, String p, String e, float ca, String g){   //creacion del constructor
	 	super(n, c, a, p);   //obtiene estos datos de la superclase
		enrollment = e;
		calif = ca;   //declaracion de variable
		group = g;
	}

	//setters y getters
	public float getCalif(){
		return calif;
	}

	public String getGroup(){
		return group;
	}
	
	public String getEnrollment(){
		return enrollment;
	}

}
	
	
	 