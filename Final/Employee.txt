//Sofia Omara Guerrero Angeles
//Programa de herencia con clase final de empleado

package Final;    //crea el paquete
import java.util.*;   //permite jalar datos entre clases

public class Employee{

    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String n, double s, int year, int month, int day){    //constructor con los parametros de la superclase y con nuevos parametros de fecha
        name = n;   //declaracionn de variables
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);    //da formato a la fecha establecida, ordena los varoles
        
        hireDay = calendar.getTime();
    }

    //getters
    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public Date getHireDay(){
        return hireDay;
    }

    //metodo para calcular el procentaje del salario 
    public void raiseSalary(double byPercent){
        double raise = salary * byPercent/100;
        salary += raise;
    }

}

        

