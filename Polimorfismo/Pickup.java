package Polimorfismo;    //crea el paquete 

public class Pickup extends Vehiculo{      //la palabra extends dentota herencia dentro de la aplicacion
    
    @Override     //para sobreescribir el metodo de la clase padre con el comportamiento de cada subclase (va antes del metodo que se va a sobreescribir)

    public void CalculateDiscount(){      //metodo opara calcular el costo total de este vehiculo en especifico
	if(year == 2019){		  //total = price-(price*0.30);    calcula el costo total del vehiculo con el 30% de descuento
		desc = (price*0.30);
		total = price-desc;
	}

	else{
		desc = 0;
		total = price-desc;
	}
					          
    }

}
