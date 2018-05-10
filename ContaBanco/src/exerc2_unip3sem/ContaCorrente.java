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
public class ContaCorrente {
    String nome;
    String num;
    double saldo;

    public ContaCorrente() {
    }

    public ContaCorrente(String nome, String num, double saldo) {
        this.nome = nome;
        this.num = num;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if(valor <= 3000){
        saldo += valor;
        }else{
            System.out.println("Depositos acima de 3 mil reais só é permitido no caixa "
                    + "dentro do banco");
        }
    }
    
    public void sacar(double valor){
        
        if(valor <= saldo){
        double taxa = valor * (0.5 /100) ;
        saldo -= (valor + taxa);
        }else{
            System.out.println("Você não tem saldo suficiente.");
        }
    }
    
    public void verSaldo(){
        System.out.println(saldo);
    }
    
    @Override
    public String toString() {
        return "ContaCorrente{" + "nome=" + nome + ", num=" + num + ", saldo=" + saldo + '}';
    }
    
    

}
