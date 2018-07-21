/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Redondeo {
    public static void main(String[] args) {
        Locale lc = new Locale("es","US");
        Locale.setDefault(lc);
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el 1er numero:");
        double num1 = sc.nextInt();
        System.out.println("Ingrese el 2do numero:");
        double num2 = sc.nextInt();
        double resul = num1/num2;
        DecimalFormat df = new DecimalFormat("#,##0.00");
        System.out.println("LA DIVISION DE " + num1 + " ENTRE " + num2 + " ES " + resul);
        System.out.println("LA DIVISION DE " + num1 + " ENTRE " + num2 + " ES " + df.format(resul));
    }
}
