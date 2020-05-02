package Final;    //crea el paquete
import java.util.*;   //permite jalar los datos entre las clases
public class Manager extends Employee{      //extends denota herencia dentro de la aplicacion

    private double bonus;

    public Manager(String n, double s, int year, int month, int day){     //contructor con parametros de la superclase y esta clase
        super(n, s, year, month, day);     //obtiene estos datos de la superclase
        bonus = 3267;   //inicializa el bonus con este valor establecido para mofificar el salario
    }

    public double getSalary(){
        double baseSalary = super.getSalary();   //hace uso del metodo getSalary de la superclase
        return baseSalary += bonus;    //retorna el salario base mas el bono
    }

    //metodo setter para modificar el valor
    public void setBonus(double b){
        bonus = b;
    }
}
