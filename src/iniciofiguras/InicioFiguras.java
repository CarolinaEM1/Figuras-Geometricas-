
package iniciofiguras;
import javax.swing.JOptionPane;
/**
 *
 * @author Carolina EM
 */
public class InicioFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String menu;
        int figuras,rep=0;
        
        menu="\tMenú Principal, escoge la opción que desees\n"+
                "1.-Cálculo del perímetro y área de un Cuadrado\n"+
                "2.-Cálculo del perímetro y área de un Rectángulo\n"+
                   "3.- Cálculo del perímetro y área de un Triángulo-Rectángulo\n"+
                   "4.- Cálculo del perímetro y área de un Círculo\n";
        
        do {
            figuras=Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (figuras){
                case 1:
                    Cuadrado a=new Cuadrado();
                    a.leerDatos();
                    a.calcular();
                    a.calcularPer();
                    JOptionPane.showMessageDialog(null,a.mostrar(),"Cuadrado",2);
                    break;
                case 2:
                    Rectangulo b=new Rectangulo();
                    b.leerRectan();
                    b.calcular();
                    b.calcPeri();
                    JOptionPane.showMessageDialog(null,b.mostrar(),"Rectangulo",2);
                    break;
                case 3:
                    Triangulo c=new Triangulo();
                    c.leerTrian();
                    c.calcular();
                    c.calcPerime();
                    JOptionPane.showMessageDialog(null,c.mostrar(),"Triangulo",2);
                    break;
                case 4:
                    Circulo d=new Circulo();
                    d.leerCirculo();
                    d.calcularAre();
                    d.calcularPer();
                    JOptionPane.showMessageDialog(null,d.mostrar(),"Circulo",2);
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null,"Error, escoge una de las opciones del menú");
                    rep++;
                    break;
            }
        }
        while(!(figuras>=1 && figuras<=4)&&rep!=3);
        if(rep==3){
            JOptionPane.showMessageDialog(null,"Error, seleccione una de las opciones","Advertencia", 2);
        }
        System.exit(0);

    }
    
}
