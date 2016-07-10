package lab02Aula;
public class Conta {
    
    private int numeroConta;
    private double saldo;
    private double limite;
    private Cliente titular;
    public static int qtConta=0;
      
    public Conta(Cliente titular){
          this.setTitular(titular);
          qtConta++;
        
    }
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String getTitular() {
        return titular.nome;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getQtConta() {
        return qtConta;
    }
    
}
