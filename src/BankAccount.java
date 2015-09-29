/**
 *
 * @author ALFARO
 */

public class BankAccount {
    private double balance; //saldo da conta
    
    public void setBalance(double b){
        //Altera o valor do saldo da conta
        balance=b;
    }
    
    public BankAccount(){
        //Constrói uma conta bancaria com saldo zero
        balance = 0;
    }
    
    public BankAccount(double initialBalance){
        //Constrói uma conta bancária com um determinado saldo inicial
        balance = initialBalance;
    }

    public void deposit(double amount){
        //Deposita valor na conta bancária
        balance+=amount;
    }
    
    public void withDraw(double amount){
        //Retira valor da conta bancária
        balance-=amount;
    }
    
    public double getBalance(){
        //Consulta o saldo da conta bancária
        return balance;
    }
    
    public void yield(double p){
        balance+= p ;
    }
    
    public void transfer(BankAccount b){
        b.balance += balance;
        balance = 0.0;
    }
    
}



