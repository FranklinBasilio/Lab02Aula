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
public class Gerente extends Funcionario{
    int senha;
	
	public boolean autenticar(int senha){
		if(this.senha == senha){
			System.out.println("Acesso Permitido");
			return true;
		}else{
			System.out.println("Acesso negado");
			return false;
		}
	}
	
	public double getBonificacao(){
		return this.salario*0.15;
	}

}
