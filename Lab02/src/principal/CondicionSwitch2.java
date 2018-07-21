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
public class CondicionSwitch2 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero del 1 al 7"));
        String resul;
        boolean esdia = true;
        switch(num){
            case 1:
                resul = "LUNES";
                break;
            case 2:
                resul = "MARTES";
                break;
            case 3:
                resul = "MIERCOLES";
                break;
            case 4:
                resul = "JUEVES";
                break;
            case 5:
                resul = "VIERNES";
                break;
            case 6:
                resul = "SABADO";
                break;
            case 7:
                resul = "DOMINGO";
                break;
            default:
                resul = "INGRESE UN NUMERO DEL 1 AL 7";
                esdia = false;
                break;
        }
        if(esdia==true){
            JOptionPane.showMessageDialog(null, "El dia del numero ingresado es " + resul);
        }else{
            JOptionPane.showMessageDialog(null, resul);
        }
    }
}
