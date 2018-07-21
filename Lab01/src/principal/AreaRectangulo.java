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
public class AreaRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int largo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el largo:"));
        int ancho = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ancho:"));
        System.out.println("El area de un rectangulo es " + (largo*ancho));
    }
    
}
