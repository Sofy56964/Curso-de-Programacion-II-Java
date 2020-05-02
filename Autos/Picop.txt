package Autos;   //crea el paquete 
import java.util.*;   //permite jalar datos entre clases
public class Picop extends Autos{      //extends denota herencia dentro de la aplicacion 

	private String niv, color;
	private int pasajeros;
  	private double descuento;
	
	public Picop(String t, String c, String ma, double cos, int m, String n, String cl, int pa){    //constructor con parametros clase madre y clase derivada
		super(t, c, ma, cos, m);    //obtiene estos datos de la superclase
		niv = n;    //declaracion de variable
		color = cl;
		pasajeros = pa;
		descuento = 0;   //inicializa el descuento
	}

	//getters
	public String getNiv(){
		return niv;
	}

	public String getColor(){
		return color;
	}

	public int getPasajeros(){
		return pasajeros;
	}

	//metodo para aplicar el descuento
	
	public double getCosto(){
		double baseCosto = super.getCosto();    //hace uso del metodo getCosto de la superclase
		return baseCosto - (baseCosto*0.70);    //retorna el costo del vehiculo menos el descuento
	}	
	
	public void setDescuento(double d){
		descuento = 0;    //inicializa el descuento
	}
	
}