package Herencia;   //crea paquete 
import java.util.*;   //jala datos entre las clases
public class PrincipalM{    //creacion de la clases    
    
    public static void main(String []args){
    
        Manager boss = new Manager("Carlos Garcia", 120000, 2003, 06, 25);    //creacion de objeto jefe con parametros establecidos
	Manager exs = new Executive("Ivone Angeles", 253680, 2001, 8, 17);    //creacion del objeto ejecutivo por medio de la sobreescritura del objeto manager
	Employee[]staff = new Employee[5];    
        //ArrayList<Employee> staff = new ArrayList<Employee>();   (solucion alternativa) creacion del arreglo dinamico con nombre staff para los empleados
        
        staff[0] = boss;   //agrega al arreglo los parametros de manager
	staff[1] = exs;    //agrega al arreglo los parameytros del ejecutivo
        staff[2] = new Employee("Nancy Cornejo", 30000, 1991, 4, 5);   //se le agrega esta informacion al arreglo
        staff[3] = new Employee("Francisco Monatana", 20000, 2019, 8, 15);  //se le agrega nuevamente informacion al arreglo 

        for(Employee employee: staff){     //for mejorado para recorrer el arreglo dinamico
            System.out.println("Nombre" + employee.getName() + "salario" + employee.getSalary() + "\n");  
            //imprime el nombre concatenado con el metodo getName de la superclase
            //imprime el salario concatenado con el metodo getSalary de la superclase y al final un enter
        }

    }
}
