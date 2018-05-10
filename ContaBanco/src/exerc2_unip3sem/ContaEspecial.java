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
public class ContaEspecial extends ContaCorrente{

    public ContaEspecial() {
    }
    
    public ContaEspecial(String nome, String num, double saldo){
        super(nome,num,saldo);
    }
    
    
    
    @Override
    public void sacar(double valor){
        
        if(valor <=saldo){
        double taxa = valor * (0.1/100);
        saldo -= (valor + taxa);
         }else{
            System.out.println("Você não tem saldo suficiente.");
      
        }
    }
}