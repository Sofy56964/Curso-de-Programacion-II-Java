package Final;   //crea el paquete
import java.util.*;     //permite jalar datos entre clases
final class Executive extends Manager{      //hereda de la clase manager y es la clase final

	private double total, bonus;
    
	public Executive(String n, double s, int year, int month, int day){     //contructor con parametros de la superclase y esta clase
		super(n, s, year, month, day);     //obtiene estos datos de la superclase
		bonus = 4825;   //inicializa el bono con este valor establecido
		total = bonus*0.1;  //el total calcula el 10% del bono
		bonus+=total;   //se suma el bono mas el total
	}

	final public double getSalary(){    //es el metodo final que evitara la herencia 
		double baseSalary = super.getSalary();    //hace uso del metodo getSalary de la superclase
		return baseSalary += bonus;   //retorna el salario base mas el nuevo bono que agreag el 10%
	}

	//metodo setter para modificar el valor del metodo final 
	final public void setBonus(double b){
		bonus = b;
	}
}
	
        
