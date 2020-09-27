package testherencia;

import java.util.Scanner;

public class VolumenCono extends VolumenCirculo{
      protected double altura;
      protected double vC;
    Circulo r = new Circulo(radio);
    
    public double pedir1(){
        System.out.println("Ingrese el valor de la altura: ");
        Scanner h = new Scanner(System.in);
        altura = h.nextInt();
        return altura;
    }
    
    public double volumen(){
        vC = (1/3) * Math.PI * Math.pow(radio, 2) * altura;
        return vC;
    }
    public void mostrarV2(){
        System.out.println("Volumen del circulo: " + vC);
    }
}
