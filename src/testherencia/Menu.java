
package testherencia;
import java.util.Scanner;
public class Menu  {
    int decision;
    Scanner h = new Scanner(System.in);
   public void Menu(){
    System.out.printf("\n ");
    System.out.printf("Bienvenido a la calculadora");
    System.out.printf("\n ");
    System.out.printf("Que vas a calcular?");
    System.out.printf("\n ");
    System.out.printf("¿Circulo y esfera? Pon 1--¿Circulo y cono? Pon 2--¿Los tres? Pon 3");
    System.out.printf("\n ");
    decision=h.nextInt();
    if(decision==1){
        Circulo r = new Circulo();
        r.pedir();
        r.calcularea();
        r.mostrar();
    System.out.printf("\n ");
    System.out.printf("----Esfera----");
    System.out.printf("\n ");
        VolumenCirculo v = new VolumenCirculo();
        v.pedir();
        v.CalcularVolumen();
        v.mostrarV();
    }
    if(decision==2){
       Circulo r = new Circulo();
        r.pedir();
        r.calcularea();
        r.mostrar();
    System.out.printf("\n ");
    System.out.printf("----Cono----");
    System.out.printf("\n ");
    VolumenCono vc= new VolumenCono();
    vc.pedir1();
    vc.volumen();
    vc.mostrarV2();
   }
    if(decision==3){
        Circulo r = new Circulo();
        r.pedir();
        r.calcularea();
        r.mostrar();
    System.out.printf("\n ");
    System.out.printf("----Esfera----");
    System.out.printf("\n ");
        VolumenCirculo v = new VolumenCirculo();
        v.CalcularVolumen();
        v.mostrarV();
    System.out.printf("\n ");
    System.out.printf("----Cono----");
    System.out.printf("\n ");
    VolumenCono vc= new VolumenCono();
        vc.pedir1();
        vc.volumen();
        vc.mostrarV2();
    }
   }   
}
