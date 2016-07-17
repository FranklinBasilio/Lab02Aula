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
public class TesteRelatorio {
    public static void main(String[] args) {
		EmpregadoUni empregado1 = new EmpregadoUni();
		empregado1.nome = "Antonio Alves";
		empregado1.setSalario(2500);
		
		Professor empregado2 = new Professor();
		empregado2.nome = "Izabel Cristina";
		empregado2.setHoraAula(40);
		empregado2.setSalario(1500);
		
		Relatorio relatorio = new Relatorio();
		relatorio.adiciona(empregado1);
		relatorio.adiciona(empregado2);

	}
}
