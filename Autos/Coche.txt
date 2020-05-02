package Autos;   //crea el paquete 
import java.util.*;   //jala los datos de una clase a otra 
public class Coche extends Autos{     //la palabra reservada extends denota herencia dentro de la aplicacion
	
	private int pasajeros, puertas;
	private String color, serie;
	private double descuento;

	public Coche(String t, String c, String ma, double cos, int m, int p, int pu, String co, String s){   //creacion del constructor con parametros de la superclase y nuevos parametros de la subclase
		super(t, c, ma, cos, m);   //obtiene esos datos de la superclase
		pasajeros = p;   //declaracion de variable
		puertas = pu;
		color = co;
		serie = s;
		descuento = 0;   //inicializa el descuento
	}

	//getters
	public int getPasajeros(){
		return pasajeros;
	}

	public int getPuertas(){
		return puertas;
	}

	public String getColor(){
		return color;
	}

	public String getSerie(){
		return serie;
	}

	//metodo para aplicar descuento
	
	public double getCosto(){
		double baseCosto = super.getCosto();     //hace uso del metodo costo de la superclase
		return baseCosto - (baseCosto*0.20);    //retorna el costo del vehiculo menos el descuento
	}

	public void setDescuento(double d){
		descuento = 0;    //inicializa el descuento 
	}
} 
