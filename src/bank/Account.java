package bank;

import bank.expections.NegativeAmountExpection;
import bank.expections.NotEoughMoneyExpection;

import java.math.BigDecimal;

/**
 * Created by Mateusz on 19.04.2017.
 */
public abstract class Account {
    private Long accountId;
    private Customer customer;
    private BigDecimal balance;
    private String currency;
    public Account(Long accountId, Customer customer, String currency) {
        this.currency = currency;
        this.accountId = accountId;
        this.customer = customer;
        this.balance = new BigDecimal(0);
    }

    public void deposit(BigDecimal cash) throws NegativeAmountExpection{
        if (cash.compareTo(new BigDecimal(0))>0){
            this.setBalance(this.getBalance().add(cash));
            return;
        }
        else{ // need to handle exceptions
            throw new NegativeAmountExpection("Tried to deposit a negative amount of money " + cash);
        }


    }
    public void charge (BigDecimal amount ) throws NotEoughMoneyExpection, NegativeAmountExpection{
        if (this.getBalance().compareTo(amount) == 1){ //can use this. get or not
            setBalance(getBalance().subtract(amount));
        }
        else{
            if(amount.compareTo(new BigDecimal(0))<=0){
                throw new NegativeAmountExpection("negative");
            }
             else{
            throw new NotEoughMoneyExpection("insufficient funds");}

        }

    }
    public void charge(double amount) throws NotEoughMoneyExpection, NegativeAmountExpection{
        charge(new BigDecimal(amount)); //conversion
    }
    public void deposit(double amount) throws NegativeAmountExpection{
        deposit(new BigDecimal(amount));
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Long getAccountId() {
        return accountId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "accountId=" + accountId +
                ", customer=" + customer +
                ", balance=" + balance +
                '}';
    }


}
