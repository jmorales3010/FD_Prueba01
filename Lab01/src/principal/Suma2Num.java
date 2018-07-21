/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import java.util.*;//Scanner
import javax.swing.*;//JOptionPane

/**
 *
 * @author Administrador
 */
public class Suma2Num {
    public static void main(String[] args) {
        //Con java.util.* --> clase Scanner
        /*
        System.out.println("Ingrese el 1er numero:");
        Scanner snum = new Scanner(System.in);
        int numero1 = snum.nextInt();
        System.out.println("Ingrese el 2do numero:");
        Scanner num2 = new Scanner(System.in);
        int numero2 = snum.nextInt();
        System.out.println("La suma de " + numero1 + " + " + numero2 + " es " + (numero1+numero2));
        */
        //Con javax.swing.* --> clase JOptionPane
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 1er numero:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 2do numero:"));
        System.out.println("La suma de " + num1 + " + " + num2 + " es " + (num1+num2));
    }
}
