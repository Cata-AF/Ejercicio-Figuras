package testherencia;

import java.util.Scanner; 

public class Circulo {
      protected double radio;
      protected double area;
    
    public Circulo(){
    }
    
    public Circulo(double r){
        radio = r;
    }
    
    public void pedir(){
        System.out.println("Ingrese el valor del radio: ");
        Scanner r = new Scanner(System.in);
        radio = r.nextInt();
 
    }
    
    public double calcularea(){
        area = Math.PI * Math.pow(radio, 2);
        return area;
    }
    
    public void mostrar(){
        System.out.println("Area del circulo: " + area);
    }
    
    public double getradio(){
        return radio;
    }
}
