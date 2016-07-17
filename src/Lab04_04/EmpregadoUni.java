/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab04_04;

/**
 *
 * @author Franklin
 */
public class EmpregadoUni {
    String nome;
	protected double salario;
	
	public double getGastos() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getInfo(){
		return this.nome+" Salario >>> "+this.getGastos();
	}
}
