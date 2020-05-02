//Sofia Omara Guerrero Angeles
//clase Automovil

package ProgramaA;  //crea el paquete 
import java.util.Scanner;
import java.util.Random;

public class Automovil{

    private int serie, km;
    private String nombre, marca;

    //constructores
    public Automovil(){
        Random r = new Random();
        serie = r.nextInt(1000);  //genera numeros aleatorios y la variable id guarda esos valores
    }

    //get y set
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String n){
        nombre = n;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String m){
        marca = m;
    }

    public int getKm(){
        return km;
    }
    
    public void setKm(int k){
        km = k;
    }

    public int getSerie(){
        return serie;
    }

    
    public void pedirDatos(){    //metodo para pedir datos al usuario
        Scanner leer = new Scanner(System.in);
        System.out.println("\nIngresa los datos: ");
        System.out.println("\nPropietario: ");
        setNombre(leer.nextLine() );    //guarda lo que el usuario ingresa como palabras en el setNombre 
        System.out.println("\nMarca: ");
        setMarca(leer.nextLine() );    //guarda lo que el usuario ingresa como palabras en el setMarca
        System.out.println("\nKilometros del vehiculo: ");
        setKm(leer.nextInt() );       //guarda lo que el usuario ingresa como palabras en el setKm
    }//pedir datos


    public String toString(){    //representa un objeto en forma de caracteres
        String cad = "\nAutomovil: "+getMarca();   //se guarda en la cadena Automovil
        cad+= "\nNumero de serie: "+getSerie();   //guarda el numero de serie y get en uno solo
        cad+= "\nPropietario: "+getNombre();    //guarda lo del nombre y get en uno solo 
        cad+= "\nKilometros: "+getKm();     //guarda los kilometros en y get en uno solo
        return cad;
    }//toString
} 
    
    

















        
