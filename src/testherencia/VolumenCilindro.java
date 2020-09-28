package testherencia;

import java.util.Scanner;

public class VolumenCilindro extends VolumenCono{
    private double vCi;
    
    Circulo r = new Circulo(getradio());
    VolumenCono h = new VolumenCono(getaltura());
    
    public double volumenCilindro(){
        vCi = getaltura() * Math.PI * Math.pow(getradio(), 2);
        return vCi;
    }
    public void mostrarV3(){
        System.out.println("Volumen del cilindro: " + vCi);
    }
}
