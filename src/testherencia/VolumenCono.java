package testherencia;

import java.util.Scanner;

public class VolumenCono extends VolumenCirculo{
    private double altura;
    private double vC;
    Circulo r = new Circulo();
    
    public double pedir(){
        System.out.println("Ingrese el valor de la altura: ");
        Scanner h = new Scanner(System.in);
        altura = h.nextInt();
        return altura;
    }
    
    public double volumen(){
        vC = (1/3) * Math.PI * Math.pow(r.getradio(), 2) * altura;
        return vC;
    }
}
