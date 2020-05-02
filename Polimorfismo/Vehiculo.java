//Sofia Omara Guerrero Angeles
//Agencia de Autos, aplicando Herencia y Polimorfismo

package Polimorfismo;      //crea el paquete 
import java.util.Scanner;   //permite la entrada de teclado

public abstract class Vehiculo{       //abstract para que se pueda reescribir en las demas clases

    protected int year, passengers, cylindrical;        //para que se puedan usar en diferentes clases se usa protected
    protected double price, total, desc;
    protected String model, fuel;
    
    Scanner leer = new Scanner(System.in);
    
    public void RequestData(){   //metodo para solicitar los datos
        System.out.print("Modelo: ");
        model = leer.nextLine();
        System.out.print("Capacidad de pasajeros: ");
        passengers = leer.nextInt();
        System.out.print("Tipo de gasolina: ");
	    leer.nextLine();    //para que no de por hecho que el usuario ha escrito algo y no se brinque esta variable 
        fuel = leer.nextLine();
        System.out.print("A�o: ");
        year = leer.nextInt();
        System.out.print("Cilindraje: ");
        cylindrical = leer.nextInt();
        System.out.print("Precio: ");
        price = leer.nextDouble();
	    System.out.println();    //salto de linea 
        
    }
    
    public abstract void CalculateDiscount();     //metodo que calcula el descuento y es abstract porque a este metodo se le va a aplicar el polimorfismo
    
    
    public void TotalPrice(){      //metodo para mostrar el total del veiculo
        System.out.println("El precio del vehiculo es: "+total);
    }
    


}