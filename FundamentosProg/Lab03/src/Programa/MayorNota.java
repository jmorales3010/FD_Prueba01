/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class MayorNota {
    public static void main(String[] args) {
        System.out.println("1ERA VERSION");
        double[] notas={11,18,12,20,14};
        double mayor=notas[0];
        for (int i = 1; i < notas.length; i++) {
            if(mayor<notas[i]){
                mayor=notas[i];
            }
        }
        System.out.println("La nota mayor es " + mayor);
        
        System.out.println("");
        
        System.out.println("2DA VERSION");
        System.out.println("Ingrese la cantidad de elementos que contedra el arreglo");
        Scanner sc = new Scanner(System.in);
        int cant = sc.nextInt();
        double[] notas2 = new double[cant];
        System.out.println("Ingrese las notas");
        for (int i = 0; i < notas2.length; i++) {
            notas2[i] = sc.nextDouble();
        }
        double notamayor = notas2[0];
        for (int i = 1; i < notas2.length; i++) {
            if(notas2[i]>notamayor){
                notamayor = notas2[i];
            }
        }
        System.out.println("La nota mayor es " + notamayor);
    }
}
