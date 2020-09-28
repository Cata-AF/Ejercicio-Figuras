package testherencia;

import java.util.Scanner;

public class Menu {

    int decision;
    Scanner h = new Scanner(System.in);

    public void Menu() {
        System.out.printf("\n ");
        System.out.printf("Bienvenido a la calculadora");
        System.out.printf("\n ");
        System.out.printf("Que vas a calcular?");
        System.out.printf("\n");
        System.out.printf("¿Circulo y esfera? Pon 1\n");
        System.out.printf("¿Circulo y cono? Pon 2\n");
        System.out.println("¿Circulo y cilindro? Pon 3");
        System.out.printf("¿Los cuatro? Pon 4\n");
        System.out.printf("\n ");
        decision = h.nextInt();
        if (decision == 1) {
            VolumenCono v = new VolumenCono();
            v.pedir();
            v.calcularea();
            v.mostrar();
            
            System.out.printf("\n ");
            System.out.printf("----Esfera----");
            System.out.printf("\n ");

            v.CalcularVolumen();
            v.mostrarV();
        }
        if (decision == 2) {
            VolumenCono vc = new VolumenCono();
            vc.pedir();  
            vc.pedir1();
            vc.calcularea();
            vc.mostrar();
            
            System.out.printf("\n ");
            System.out.printf("----Cono----");
            System.out.printf("\n ");
            
            vc.volumen();
            vc.mostrarV2();
        }
        
        if (decision == 3) {
            VolumenCilindro vci = new VolumenCilindro();
            vci.pedir();  
            vci.pedir1();
            vci.calcularea();
            vci.mostrar();
            
            System.out.printf("\n ");
            System.out.printf("----Cilindro----");
            System.out.printf("\n ");
            
            vci.volumenCilindro();
            vci.mostrarV3();
        }
        
        if (decision == 4) {
            VolumenCilindro vci = new VolumenCilindro();
            vci.pedir();
            vci.pedir1();
            vci.calcularea();
            vci.mostrar();
            
            System.out.printf("\n ");
            System.out.printf("----Esfera----");
            System.out.printf("\n ");
            
            vci.CalcularVolumen();
            vci.mostrarV();
            
            System.out.printf("\n ");
            System.out.printf("----Cono----");
            System.out.printf("\n "); 
            
            vci.volumen();
            vci.mostrarV2();
            
            System.out.printf("\n ");
            System.out.printf("----Cilindro----");
            System.out.printf("\n ");
            
            vci.volumenCilindro();
            vci.mostrarV3();
        }
    }
}
