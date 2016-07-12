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
public class Conta {
    int numero;
    double saldo;
    double limite;
    Cliente titular;
    public Conta(Cliente titular){
        this.titular=titular;
    }
    public Conta(int numero){
        this.numero= numero;
    }
}
