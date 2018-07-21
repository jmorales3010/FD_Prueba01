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
public class ArrayBidimensional {
    static String[][] miarray  = new String[5][2];
    public static void main(String[] args) {
        miarray[0][0]="1";
        miarray[0][1]="a";
        miarray[1][0]="2";
        miarray[1][1]="e";
        miarray[2][0]="3";
        miarray[2][1]="i";
        miarray[3][0]="4";
        miarray[3][1]="o";
        miarray[4][0]="4";
        miarray[4][1]="u";
        for (int i = 0; i < miarray.length; i++) {
            for (int j = 0; j < miarray[i].length; j++) {
                System.out.println(miarray[i][j]);
            }
        }
    }
}
