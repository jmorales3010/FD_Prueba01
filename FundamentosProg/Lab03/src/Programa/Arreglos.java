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
public class Arreglos {
    public static void main(String[] args) {
        System.out.println("1ERA VERSION");
        String[] miarray = new String[5];
        miarray[0]="a";
        miarray[1]="e";
        miarray[2]="i";
        miarray[3]="o";
        miarray[4]="u";
        for (int i = 0; i < miarray.length; i++) {
            System.out.println("el valor de " + i + " es " + miarray[i]);
        }
        System.out.println("");
        System.out.println("2DA VERSION");
        String[] miarray2 = {"a","e","i","o","u"};
        for (int i = 0; i < miarray2.length; i++) {
            System.out.println("el valor de " + i + " es " + miarray2[i]);
        }
    }
}
