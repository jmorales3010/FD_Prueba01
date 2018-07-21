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
    static double[][] miarray  = new double[3][3];
    public static void main(String[] args) {
        miarray[0][0]=10;
        miarray[0][1]=11;
        miarray[0][2]=12;
        
        miarray[1][0]=20;
        miarray[1][1]=14;
        miarray[1][2]=15;
        
        miarray[2][0]=16;
        miarray[2][1]=17;
        miarray[2][2]=18;
        
        double mayor = 0;
        
        for (int i = 0; i < miarray.length; i++) {
            for (int j = 0; j < miarray[i].length; j++) {
                if(miarray[i][j]>mayor){
                    mayor = miarray[i][j];
                }
            }
        }
        
        System.out.println("El numero mayor es " + mayor);
    }
}
