/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab03aula;

import lab02Aula.Cliente;

/**
 *
 * @author Franklin
 */
public class ContaCorrente extends Conta{
    
    public ContaCorrente(Cliente titular, int nconta, float saldo) {
        super(titular);
        this.nomeCorrentista = titular;
	      this.numeroConta = nconta;
	      this.saldoConta = saldo;	
    }
    
    public void depositar(float valorDeposito){
	      saldoConta = saldoConta + valorDeposito;
	   }
	   public void sacar(float valorSaque){
              if (valorSaque <= saldoConta)
		saldoConta = saldoConta - valorDeposito;
	      else
		System.out.println("Saldo insuficiente!");
	   }
	   public void mostrarStatus(){
	      System.out.println(nomeCorrentista);
	      System.out.println(numeroConta);
	      System.out.println("R$ " + saldoConta);
	   }
    
}
