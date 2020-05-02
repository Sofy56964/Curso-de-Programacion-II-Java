//Sofia Omara Guerrero Angeles
//Herencia y polimorfismo

package Autos;  //crea el paquete 
import java.util.*;  //permite jalar los datos de una calse a otra
public class Autos{

	private String tipo, comprador, marca;
	private double costo;
	private int modelo;

	public Autos(String t, String c, String ma, double cos, int m){   //creacion del constructor
		tipo = t;    //declaracion de las variables
		comprador = c;
		marca = ma;
		costo = cos;
		modelo = m;
	}

	//metodos getters
	public String getTipo(){
		return tipo;
	}

	public String getComprador(){
		return comprador;
	}

	public String getMarca(){
		return marca;
	}

	public double getCosto(){
		return costo;
	}

	public int getModelo(){
		return modelo;
	}

}