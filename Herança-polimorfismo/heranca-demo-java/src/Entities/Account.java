package Entities;

public class Account {
    private Integer number;
    private String holder;
    protected Double balance; // protected permite o acesso ao atributo por subclasses.

    public Account() { //obrigatório a sobrescrita com construtor padrão senão a classe não será capaz de passar herança de dados.

    }
    
    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void withdraw(Double amount) {
        balance -= amount;
    } 

    public void deposit(Double amount) {
        balance += amount;
    }
    
}
