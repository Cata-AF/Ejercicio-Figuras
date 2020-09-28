package testherencia;

import java.util.Scanner;

public class VolumenCono extends VolumenCirculo{
      private double altura;
      private double vC;
    
    public double pedir1(){
        System.out.println("Ingrese el valor de la altura: ");
        Scanner h = new Scanner(System.in);
        altura = h.nextInt();
        return altura;
    }
    
    public double volumen(){
        float division = (float) 1/3;
        vC = division * Math.PI * Math.pow(getradio(), 2) * altura;
        return vC;
    }
    public void mostrarV2(){
        System.out.println("Volumen del cono: " + vC);
    }
    public double getaltura(){
        return altura;
    }
       public void setaltura(int h)
    {
        altura=h;
    }
       public double getvC(){
        return vC;
    }
       public void setvC(int v2)
    {
        vC=v2;
    }
}
