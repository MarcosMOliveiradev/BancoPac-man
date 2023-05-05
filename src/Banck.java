package src;
import src.User;

public class Banck extends User {  
    
    
    private String conta;
    private int agencia;
    private double saldo = 0;

    public void setConta(String conta){
        this.conta = conta;
    }
    public void setAgencia(int agencia){
        this.agencia = agencia;
    }


    public String getConta(){
        return conta;
    }
    public int getAgencia(){
        return agencia;
    }

    

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        if(valor <= saldo) saldo -= valor;
        else {
            throw new RuntimeException("Saldo insuficiente!");
        }
    }

    public double getSaldo(){
        return saldo;
    }


}