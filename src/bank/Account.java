package bank;

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
    public BigDecimal deposit(BigDecimal cash){
        this.setBalance(this.getBalance().add(cash));
        return this.getBalance();
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
