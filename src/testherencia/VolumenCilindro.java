
package testherencia;
public class VolumenCilindro extends VolumenCono {
    private double vCilindro;
    public  double vCilindro(){
        vCilindro=Math.PI * Math.pow(getradio(), 2)*getaltura();
        return vCilindro;
    }
    public void mostrarvCilindro(){
        System.out.println("Volumen del cilindro: " + vCilindro);
    }
}
