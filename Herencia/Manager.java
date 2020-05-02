package Herencia;    //crea el paquete 
import java.util.*;    //jala los datos de una clase a otra
public class Manager extends Employee{    //la palabra reservada extends denota herencia dentro de la aplicacion
    /*
        @param n es el nombre del empleado 
        @param s es el salario
        @param year es el año de contratacion 
        @param month es el mes de contratacion  
        @param day es el dia de contratacion
    */

    public Manager(String n, double s, int year, int month, int day){    //creacion del costructor
        super(n,s,year,month,day);    //obtiene datos de la superclase
        bonus = 0;    //inicializa el bonus
    }
        
    public double getSalary(){
        double baseSalary = super.getSalary();   //hace uso del metodo getSalary de la superclase
        return baseSalary += bonus;   //retorna el salario base mas el bono
    }

    public void setBonus(double b){
        bonus = 0;    //inicializa el bono
    }
    
    private double bonus;

}//llave de la clase
    
