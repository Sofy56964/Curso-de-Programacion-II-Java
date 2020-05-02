package Polimorfismo;    //crea el paquete

public class Coche extends Vehiculo{      //la palabra extends denota herencia en la aplicacion

    @Override     //para sobreescribir el metodo de la clase padre con el comportamiento de cada subclase (va antes del metodo que se va a sobreescribir)
    
    public void CalculateDiscount(){		//metodo para calcular el costo total de este vehiculo en especifico
	if(year == 2019){			//total = price-(price*0.20);  (solucion alternativa) calcula el costo total con el 20% de descuento     
		desc = (price*0.20);
		total = price-desc;
	}

	else{
		desc = 0;
		total = price-desc;
	}
	
    }
}

