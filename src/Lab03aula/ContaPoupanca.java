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
public class ContaPoupanca extends Conta{
    
    public ContaPoupanca(Cliente titular, int nconta, float saldo, float adicional) {
        super(titular, nconta, saldo);
	      this.percentAdd = adicional;
       // super(titular);
    }
    
    public void addRendimentos(float addRendimento){
	      this.saldoConta = this.saldoConta * addRendimento;
	   }
}
