//Sofia Omara Guerrero Angeles
//Herencia de personas, alumnos y profesores

package Herper;   //crea el paquete 
import java.util.Scanner;
import java.util.*;   //permite jalar los datos de una clase a otra
public class Person{
	
	private String name, career, phone;
	private int age;

	public Person(String n, String c, int a, String p){    //creacion del constructor 
		name = n;   //declaracion de variables
		career =c;
		age = a;
		phone = p;
	}

	//metodos setters y getters
	public String getName(){
		return name;
	} 

	public String getCareer(){
		return career;
	}	

	public int getAge(){
		return age;
	}

	public String getPhone(){
		return phone;
	}
	

}  





	 