
package iniciofiguras;
import javax.swing.JOptionPane;
/**
 *
 * @author Carolina EM
 */
public class Triangulo {
    double area,perimetro,altura,base,hipotenusa;
    
    void leerTrian(){
        altura=Double.parseDouble(JOptionPane.showInputDialog("Teclea la altura del triangulo"));
        base=Double.parseDouble(JOptionPane.showInputDialog("Teclea la base del triangulo"));
        hipotenusa=Double.parseDouble(JOptionPane.showInputDialog("Teclea la hipotenusa"));
    }
    double calcular(){
        area=(base*altura)/2;
        return area;
    }
    double calcPerime(){
        perimetro=(base+altura+hipotenusa);
        return perimetro;
    }
    String mostrar(){
        String aux;
        if (hipotenusa==altura && hipotenusa==base){
            aux="Invalido";
        }
        else{
            if(altura<=0 && base<=0){
                aux="Invalido";
            }
            else {
                if (hipotenusa<altura && hipotenusa<base){
                    aux="Invalido";
                }
                else {
                    aux="Base del triangulo: "+base+"\nAltura: "+altura+"\nHipotenusa: "+hipotenusa+"\nEl area es: "+area+"\nEl perimetro es:"+perimetro;
                }
            }
        }
        return aux;
    }
    
}
