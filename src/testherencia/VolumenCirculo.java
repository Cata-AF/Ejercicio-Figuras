package testherencia;

 class VolumenCirculo extends Circulo {
     protected double volumen;  
     double CalcularVolumen(){
        System.out.println(" " + radio);
        volumen = (4/3) * (3.1416) * Math.pow(radio, 3);
        return volumen;
    }
    
    public void mostrarV(){
        System.out.println(" " + radio);
        System.out.println("Volumen del circulo: " + volumen);
    }
}
