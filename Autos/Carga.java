package Autos;   //crea paquetes
import java.util.*;   //jala datos entre clases
public class Carga extends Autos{    //extends denota herencia dentro de la aplicacion

	private int cilindros, ejes;
	private float capacidad;
	private double descuento;
	
	public Carga(String t, String c, String ma, double cos, int m, int ci, int e, float cap){    //creacion del constructor con parametros de la clase madre y clase derivada
		super(t, c, ma, cos, m);   //obtiene los datos de la superclase
		cilindros = ci;   //declaracion de la variable
		ejes = e;
		capacidad = cap;
		descuento = 0;     //inicializa el descuento
	}

	//getters	
	public int getCilindros(){
		return cilindros;
	}

	public int getEjes(){
		return ejes;
	}

	public float getCapacidad(){
		return capacidad;
	}
	
	//metodo para aplicar el descuento
	public double getCosto(){
		double baseCosto = super.getCosto();   //hace uso del metodo getCosto de la superclase
		return baseCosto - (baseCosto*0.05);    //retorna el costo del vehiculo menos el descuento
	}

	public void setDescuento(double d){
		descuento = 0;   //inicializa el descuento
	}
	
}