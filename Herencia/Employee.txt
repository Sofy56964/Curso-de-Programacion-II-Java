//Sofia Omara Guerrero Angeles
//Herencia

package Herencia;     //crea el paquete 
import java.util.*;     //permite jalar los datos de una clase a otra
public class Employee{
  
    public Employee(String n, double s, int year, int month, int day){        //creacion del constructor con parametros
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);    //GregorianCalendar nos permite jalar la fecha 
        //GregoranCalendar usa el 0 para enero

        hireDay = calendar.getTime();   //sirve para formato de fecha, lo coloca en orden 
    }

    //metodos getters
    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public Date getHireDay(){
        return hireDay;
    }

    public void raiseSalary(double byPercent){   //calcula el aumento en el salario
        double raise = salary * byPercent/100;   //porcentaje que sube al salario
        salary += raise;   //suma el salario mas el raise
    }

    private String name;
    private double salary;
    private Date hireDay;

}//llave de la clase  
