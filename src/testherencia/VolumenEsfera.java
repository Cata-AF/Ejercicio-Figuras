package testherencia;

 class VolumenCirculo extends Circulo {
     private double volumen;  
     double CalcularVolumen(){
        float division = (float) 4/3;
        volumen = division * Math.PI * Math.pow(getradio(), 3);
        return volumen;
    }
    
    public void mostrarV(){
        System.out.println("Volumen de la esfera: " + volumen);
    }
      public double getvolumen(){
        return volumen;
    }
       public void setvolumen(int v)
    {
        volumen=v;
    }
}
