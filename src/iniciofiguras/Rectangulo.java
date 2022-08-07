
package iniciofiguras;
import javax.swing.JOptionPane;
/**
 *
 * @author Carolina EM
 */
public class Rectangulo {
    double alto,ancho,area,perimetro;
    
    void leerRectan(){
        alto=Double.parseDouble(JOptionPane.showInputDialog("Teclea la altura del rectangulo"));
        ancho=Double.parseDouble(JOptionPane.showInputDialog("Teclea el ancho del rectangulo"));
    }
    double calcular(){
        area=(alto*ancho);
        return area;
    }
    double calcPeri(){
        perimetro=(alto*2)+(ancho*2);
        return perimetro;
    }
    String mostrar(){
        String aux;
        if (alto==ancho){
            aux="Invalido";
        }
        else{
            aux="Base del rectangulo: "+ancho+"\nAltura: "+alto+"\nEl area es: "+area+"\nEl perimetro es: "+perimetro;
        }
        return aux;
    }
    
}
