/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab04;

/**
 *
 * @author Franklin
 */
public class Funcionario {
        protected String nome;
	protected double salario;
	protected String cpf;
	
	public double getBonificacao(){
		return this.salario*0.10;
	}

}
