//Sofia Omara Guerrero Angeles
//programa de clase (alumnos y profesor)

package ProgramaC2;   //crea el paquete 
import java.util.*;   //permite jalar datos entre clases
public class Clase{

	private String nombre, sexo;
	private int edad;

	public Clase(String n, String s, int e){    //creacion del constructor
		nombre = n;   //declaracion de variables
		sexo = s;
		edad = e;
	}

	//getters
	public String getNombre(){
		return nombre;
	}

	public String getSexo(){
		return sexo;
	}

	public int getEdad(){
		return edad;
	}

}
