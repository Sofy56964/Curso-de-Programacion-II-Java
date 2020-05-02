package Autos;   //crea el paquete 
import java.util.*;    //permite jalar datos entre las clases
public class Suv extends Autos{   //extends denota herencia dentro de la aplicacion 

	private String id;
	private int cilindros;
	private double descuento;

	public Suv(String t, String c, String ma, double cos, int m, String i, int cil){    //creacion del constructor con parametros de la clase madre y clase derivada
		super(t, c, ma, cos, m);   //obtiene los datos de la superclase
		id = i;   //declaracion de la variable
		cilindros = cil;
		descuento = 0;     //inicializa el descuento
	}

	//getters
	public String getId(){
		return id;
	}

	public int getCilindros(){
		return cilindros;
	}

	//metodo para aplicar el descuento
	
	public double getCosto(){
		double baseCosto = super.getCosto();    //hace uso del metodo getCosto de la superclase
		return baseCosto - (baseCosto*0.90);    //retorna el costo del vehiculo menos el descuento
	}

	public void setDescuento(double d){
		descuento = 0;  //incializa el descuento
	}

}
