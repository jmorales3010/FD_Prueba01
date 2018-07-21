/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO:");
        int num = sc.nextInt();
        System.out.println("LA TABLA DE MULTIPLICAR DEL NUMERO " + num + " ES:");
        for (int i = 0; i < 13; i++) {
            System.out.println(i + " x " + num + " = " + (i*num));
        }
    }
    
}
