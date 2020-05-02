package Herencia;
import java.util.*;
final class Ejecutivo extends Manager{

       public  Ejecutivo (String n, double s, int year, int month, int day){
           super(n,s,year,month,day);
        double z,x;

          bonus =5000;
          z= bonus*0.1;
          bonus+=z;

  }

      final public double getSalary(){
          double baseSalary = super.getSalary();
          return baseSalary += bonus;
      }

      final public void setBonus(double b){
          bonus=b;
      }
      private double bonus;





}
