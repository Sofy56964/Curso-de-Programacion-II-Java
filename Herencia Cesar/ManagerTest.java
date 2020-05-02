package Herencia;

import java.util.*;

public class ManagerTest{
    public static void main(String[]args){


    Manager boss = new Manager("Carlos Garcia",120000,2003,06,25);
    Manager ej = new Ejecutivo("Pablito Mix",150000,2004,05,28);
    Employee[]staff=new Employee[4];
    staff[0]=boss;
    staff[1]=ej;
    staff[2]=new Employee("Nancy Cornejo",30000,1991,4,5);
    staff[3]=new Employee("Francisco Montana",20000,2019,8,15);



    for(Employee employee:staff){
        System.out.println("Nombre="+employee.getName()+"Salario="+employee.getSalary());
    }


}
}
