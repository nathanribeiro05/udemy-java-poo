package Entities;

public final class SavingsAccount extends Account { //palavra final impede que a classe seja herdada por outra.
    private Double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
    
    public void updateBalance() {
        balance += balance*interestRate;
    }

    @Override //sobrescrita do método da superclasse (Account). deve ter a anotação @Override para o compilador saber que estamos sobrescrevendo o método.
    public final void withdraw(Double amount) { //palavra final impede que o método da classe seja sobreposto por outra.
        balance -= amount;
    }
}
