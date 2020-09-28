package testherencia;

 class VolumenCirculo extends Circulo {
     protected double volumen;  
     double CalcularVolumen(){
        System.out.println(" " + radio);
        float division = (float) 4/3;
        volumen = division * Math.PI * Math.pow(radio, 3);
        return volumen;
    }
    
    public void mostrarV(){
        System.out.println("Volumen del circulo: " + volumen);
    }
}
