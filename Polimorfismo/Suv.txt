package Polimorfismo;      //crea el paquete 

public class Suv extends Vehiculo{    //la palabra extends denota herencia 
    
    @Override     //para sobreescribir el metodo de la clase padre con el comportamiento de cada subclase (va antes del metodo que se va a sobreescribir)

    public void CalculateDiscount(){    //metodo que calcula el descuento y total de este Vehiculoe especifico
	if(year ==2019){		//total = price-(price*0.10);  (solucion alternativa) calcula el costo total con el descuento del 10%
		desc = (price*0.10);
		total = price-desc;
	}

	else{
		desc = 0;
		total = price-desc;
	}
        
    }

}
