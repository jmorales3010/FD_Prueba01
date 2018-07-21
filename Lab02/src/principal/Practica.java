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
public class Practica {
    public static void main(String[] args) {
        //EN MEGA PLAZA SE HACE UN 20% DE DSCTO A LOS CLIENTES CON COMPRAS MAYORES A S/ 300
        //¿CUAL SERA LA CANTIDAD QUE PAGARA UNA PERSONA POR SU COMPRA?
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE EL MONTO DE LA COMPRA:");
        double monto = sc.nextDouble();
        if(monto>300){
            System.out.println("USTED A OBTENIDO UN DSCTO DEL 20%");
            double resul = monto*0.2;
            resul = monto - resul;
            System.out.println("SU MONTO A PAGAR ES DE " + resul);
        }else{
            System.out.println("NO ACCEDIO A NINGUN DSCTO");
        }
        System.out.println("GRACIAS");
    }
}
