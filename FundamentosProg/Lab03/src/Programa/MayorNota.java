/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

/**
 *
 * @author Administrador
 */
public class MayorNota {
    public static void main(String[] args) {
        double[] notas={11,18,12,20,14};
        double mayor=notas[0];
        for (int i = 1; i < notas.length; i++) {
            if(mayor<notas[i]){
                mayor=notas[i];
            }
        }
        System.out.println("La nota mayor es " + mayor);
    }
}
