/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import java.text.DecimalFormat;
import java.util.Locale;
import javax.swing.*;
/**
 *
 * @author Administrador
 */
public class AreaCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Locale loc = new Locale("es", "US");
        Locale.setDefault(loc); 
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio:"));
        double resul = (Math.PI * Math.pow(radio, 2));
        DecimalFormat df = new DecimalFormat("#,##0.00");
        System.out.println("El area del circulo es " + df.format(resul));
    }
    
}