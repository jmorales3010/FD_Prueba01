/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import javax.swing.*;
/**
 *
 * @author Administrador
 */
public class AreaTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el base:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el altura:"));
        double resul = (base * altura)/2;
        System.out.println("El area de un trinagulo es " + resul);
    }
    
}
