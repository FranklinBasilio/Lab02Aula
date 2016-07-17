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
public class Professor extends EmpregadoUni{
    	protected int horaAula=0;

	public int getHoraAula() {
		return horaAula;
	}

	public void setHoraAula(int horaAula) {
		this.horaAula = horaAula*10;
	}
	
	public double getGastos(){
		return super.getGastos()+this.getHoraAula();
	}
	
	public String getInfo(){
		return super.getInfo()+" Horas aula "+this.getHoraAula();
	}

}
