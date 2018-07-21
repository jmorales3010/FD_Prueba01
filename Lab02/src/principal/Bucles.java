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
public class Bucles {
    public static void main(String[] args) {
        System.out.println("INGRESE UNA VOCAL");
        Scanner sc = new Scanner(System.in);
        String vocal = sc.next().toLowerCase();
        while(!vocal.equals("a") && !vocal.equals("e") && !vocal.equals("i") && !vocal.equals("o") && !vocal.equals("u")){
            System.out.println("NO ES UNA VOCAL ... INGRESE UNA VOCAL");
            vocal = sc.next().toLowerCase();   
        }
        System.out.println("BYE");
    }
}
