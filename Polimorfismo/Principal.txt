package Polimorfismo;     //crea el paquete 
import java.util.Scanner;

public class Principal{

    public static void main(String[] args){
    
        int opc, num;
        
        System.out.println("¿Desea ejecutar el programa?");
        System.out.println("Si = 1,  No = 2");
        Scanner leer = new Scanner(System.in);
        num = leer.nextInt();
        
        
        do{
            System.out.println("\nEscoja una opcion: ");
            System.out.println("1. Coche ");
            System.out.println("2. Suv ");
            System.out.println("3. Pickup ");
            System.out.println("4. Carga ");
            System.out.println("5. Salir ");
            opc = leer.nextInt();
            
            switch(opc){
                case 1: 
                    System.out.println("\nCoche: ");
                    Vehiculo precioCoche = new Coche();     //creacion del objeto
                    precioCoche.RequestData();      //invocacion por medio del objeto al metodo RequestData(superclase)
                    precioCoche.CalculateDiscount();     //invocacion por medio del objeto al metodo CalculateDiscount(subclase)
                    precioCoche.TotalPrice();   //invocacion por medio del objeto al metodo TotalPrice(superclase)
                    break;

                case 2:
		    System.out.println("\nSuv: ");
                    Vehiculo precioSuv = new Suv();     //creacion del objetoSystem.out.println("\nHasta pronto...");
                    precioSuv.RequestData();    //invocacion por medio del objeto al metodo RequestData(superclase)
                    precioSuv.CalculateDiscount();     //invocacion por medio del objeto al metodo CalculateDiscount(subclase)
                    precioSuv.TotalPrice();     //invocacion por medio del objeto al metodo TotalPrice(superclase)
                    break;

                case 3: 
		    System.out.println("\nPickup: ");
                    Vehiculo precioPickup = new Pickup();    //creacion del objeto
                    precioPickup.RequestData();      //invocacion por medio del objeto al metodo RequestData(superclase)
                    precioPickup.CalculateDiscount();      //invocacion por medio del objeto al metodo CalculateDiscount(subclase)
                    precioPickup.TotalPrice();     //invocacion por medio del objeto al metodo TotalPrice(superclase)
                    break;

                case 4: 
		    System.out.println("\nCarga: ");
                    Vehiculo precioCarga = new Carga();     //creacion del objeto
                    precioCarga.RequestData();        //invocacion por medio del objeto al metodo RequestData(superclase)
                    precioCarga.CalculateDiscount();      //invocacion por medio del objeto al metodo CalculateDiscount(subclase)
                    precioCarga.TotalPrice();      //invocacion por medio del objeto al metodo TotalPrice(superclase)
                    break;
                
                case 5: 
                    System.out.println("\nHasta pronto...  :) ");
                    System.exit(0);   //sale del switch
                    break;				
                    
                        
            }

        }while(num == 1);


    }

}
