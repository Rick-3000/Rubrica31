/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rickypilayingdesoft2;

/**
 *
 * @author Kite
 */
public class Operador {
    
    private int valor1;
    private int valor2;
    int opcion;
    int total;
    

    /**
     * @return the valor1
     */
    public int getValor1() {
        return valor1;
    }

    /**
     * @param valor1 the valor1 to set
     */
    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    /**
     * @return the valor2
     */
    public int getValor2() {
        return valor2;
    }

    /**
     * @param valor2 the valor2 to set
     */
    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    /**
     * @return the opcion
     */
   public int Suma(){
       total = valor1 + valor2;
       return total;
   }
   
   public int Resta(){
       total = valor1 - valor2;
       return total;
   }
   
   public int Multiplicacion(){
       total = valor1 * valor2;
       return total;
   }
    
    
    
    
}
