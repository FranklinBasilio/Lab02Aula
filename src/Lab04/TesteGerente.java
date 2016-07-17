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
public class TesteGerente {	public static void main(String []args){
		ControleDeBonificacao controle = new ControleDeBonificacao();
		Gerente funcionario1 = new Gerente();
		funcionario1.salario = 5000;
		controle.setBonificacao(funcionario1);
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.salario = 1000;
		controle.setBonificacao(funcionario2);
		
		System.out.println(controle.getBonificacao());
	}
}
