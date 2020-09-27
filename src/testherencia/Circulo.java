package testherencia;

import java.util.Scanner; 

public class Circulo {
    private double radio;
    private double area;
    
    public Circulo(){
        radio = 0;
    }
    
    public Circulo(double r){
        radio = r;
    }
    
    public double pedir(){
        System.out.println("Ingrese el valor del radio: ");
        Scanner r = new Scanner(System.in);
        radio = r.nextInt();
        return radio;
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
