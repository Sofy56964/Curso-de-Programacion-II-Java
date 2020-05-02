package Herencia;   //crea paquete 
import java.util.*;   //jala datos entre las clases
public class ManagerTest{    //creacion de la clases    
    
    public static void main(String []args){
    
        Manager boss = new Manager("Carlos Garcia", 120000, 2003, 06, 25);   //creacion de objeto jefe con parametros establecidos
        ArrayList<Employee> staff = new ArrayList<Employee>();   //creacion del arreglo dinamico con nombre staff para los empleados
        //Employee[]staff = new Employee[3];    solucion alternativa
        
        staff.add(boss);
        staff.add(new Employee("Nancy Cornejo", 30000, 1991, 4, 5));   //se le agrega esta informacion al arreglo dinamico
        staff.add(new Employee("Francisco Monatana", 20000, 2019, 8, 15));  //se le agrega nuevamente informacion al arreglo dinamico
        
        for(Employee employee:staff){     //for mejorado para recorrer el arreglo dinamico
            System.out.println("Nombre= " + employee.getName()+"," + " Salario= " + employee.getSalary() );  
            //imprime el nombre concatenado con el metodo getName de la superclase
            //imprime el salario concatenado con el metodo getSalary de la superclase y al final un enter
        }

    }
}
