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
public class Practica {
    public static void main(String[] args) {
        //ARREGLO STRING DE 6 VALORES - NOMBRE ALUMNOS
        String[] alum = new String[5];
        //ARREGLO DOUBLE DE 6 VALORES - NOTAS
        double[] nota = new double[5];
        for (int i = 0; i < nota.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el nombre del alumno:");            
            alum[i] = sc.nextLine();
            System.out.println("Ingrese su nota:");
            nota[i] = sc.nextDouble();
        }
        //SI NOTA < 11 ==> NECESITA APOYO
        //SI NOTA >= 11 && <16 ==> MEJORANDO
        //SI NOTA > 16 ==> MUY BIEN
        System.out.println("");
        System.out.println("--- RESULTADOS ---");
        for (int i = 0; i < nota.length; i++) {
            if(nota[i]<11){
                System.out.println(alum[i] + " NECESITAN APOYO");
            }else if(nota[i]>=11 && nota[i]<16){
                System.out.println(alum[i] + " ESTAN MEJORANDO");
            }else{
                System.out.println(alum[i] + " MUY BIEN");
            }
        }
    }
}
