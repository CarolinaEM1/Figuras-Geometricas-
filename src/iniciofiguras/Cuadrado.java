
package iniciofiguras;
import javax.swing.JOptionPane;
/**
 *
 * @author Carolina EM
 */
public class Cuadrado {
    double area,perim,lado;
    
    void leerDatos(){
        lado=Double.parseDouble(JOptionPane.showInputDialog("Teclea el lado del cuadrado"));
    }
    double calcular(){
        area=Math.pow(lado,2);
        return area;
    }
    double calcularPer(){
        perim=4*lado;
        return perim;
    }
    String mostrar(){
        String aux;
        if (lado<=0){
            aux="Esta figura no es cuadrado";
        }
        else{
            aux="El lado del cuadrado: "+lado+"\nArea del cuadarado: "+area+"\nPerimetro: "+perim;
        }
        return aux;
    }
    
}
