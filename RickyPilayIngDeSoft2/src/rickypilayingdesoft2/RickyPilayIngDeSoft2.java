/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rickypilayingdesoft2;

import java.util.Scanner;

/**
 *
 * @author Kite
 */
public class RickyPilayIngDeSoft2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("--------Menú-------------");
        System.out.println("1.- Sumar\n"
                         + "2.- Restar\n"
                         + "3.- Multiplicar");
        Operador op = new Operador();
        Scanner ingreso = new Scanner(System.in);
        op.opcion=ingreso.nextInt();
        System.out.println("Ingrese el primer valor: ");
        op.setValor1(ingreso.nextInt());
        System.out.println("Ingrese el segundo valor: ");
        op.setValor2(ingreso.nextInt());
        if (op.opcion==1) {
            op.Suma();
        }else{
            if(op.opcion==2){
                op.Resta();
            }else{
                if (op.opcion==3) {
                    op.Multiplicacion();
                }else{
                    System.out.println("Operación no reconocida");
                }
            }
        }
        
        System.out.println("El resultado de "+op.getValor1()+" y "+op.getValor2()+" es: "+ op.total);
        
        
    }
    
}
