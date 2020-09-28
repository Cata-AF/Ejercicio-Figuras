package testherencia;

 class VolumenEsfera extends Circulo {
     private double volumen;  
     double CalcularVolumen(){
        System.out.println(" " + getradio());
        float division = (float) 4/3;
        volumen = division * Math.PI * Math.pow(getradio(), 3);
        return volumen;
    }
    
    public void mostrarV(){
        System.out.println("Volumen del circulo: " + volumen);
    }
}
