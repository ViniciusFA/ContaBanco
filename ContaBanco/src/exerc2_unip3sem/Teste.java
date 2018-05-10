/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc2_unip3sem;

/**
 *
 * @author Vini
 */
public class Teste {
    
    public static void main(String[] args){
        
        ContaEspecial vinicius = new ContaEspecial("Vinicius", "1988-AC", 1000.00);
        System.out.println("R$ " + vinicius.getSaldo());
        
        vinicius.sacar(500.0);
          System.out.println("R$ " + vinicius.getSaldo());
          
          vinicius.depositar(3001.0);
          System.out.println("R$ " + vinicius.getSaldo());
        
    }
    
}
