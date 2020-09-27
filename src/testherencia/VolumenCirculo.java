package testherencia;

public class VolumenCirculo {
    private double volumen;
    Circulo r = new Circulo();
    
    public double CalcularVolumen(){
        volumen = (4/3) * (3.1416) * Math.pow(r.getradio(), 3);
        return volumen;
    }
    
    public void mostrarV(){
        System.out.println("Volumen del circulo: " + volumen);
    }
}
