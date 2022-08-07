
package iniciofiguras;
import javax.swing.JOptionPane;
/**
 *
 * @author Carolina EM
 */
public class Circulo {
    double area,perimetro,radio;
    
    void leerCirculo(){
        radio=Double.parseDouble(JOptionPane.showInputDialog("Teclea el radio del circulo"));
    }
    double calcularAre(){
        area=Math.PI*Math.pow(radio,2);
        return area;
    }
    double calcularPer(){
        perimetro=Math.PI*(2*radio);
        return perimetro;
    }
    String mostrar(){
        String aux;
        if (radio<=0){
            aux="Invalido";
        }
        else {
            aux="Radio: "+radio+"\nArea: "+area+"\nPerimetro: "+perimetro;
        }
        return aux;
    }
    
}
