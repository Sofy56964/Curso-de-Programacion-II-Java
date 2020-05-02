package Herper;   //creacion de la paqueteria 
import java.util.Scanner;
import java.util.*;   //jala los datos entre clases

public class Teacher extends Person{     //extends denota herencia en la aplicacion
	
	private String subject;	

	public Teacher(String n, String c, int a, String p, String s){   //creacon del constructor
	 	super(n, c, a, p);   //obtiene estos datos de la superclase
		subject = s;   //inicializa la variable 
	}

	//setters y getters
	public String getSubject(){
		return subject;
	}	

}