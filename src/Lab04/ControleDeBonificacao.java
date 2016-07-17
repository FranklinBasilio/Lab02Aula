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
public class ControleDeBonificacao {
	double bonificacao = 0;

	public double getBonificacao() {

		return bonificacao;

	}


	public void setBonificacao(Funcionario f) {

		this.bonificacao += f.getBonificacao();
	}
	
}

