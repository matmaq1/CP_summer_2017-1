package bank;

import bank.expections.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mateusz on 19.04.2017.
 */
public class Bank {
    List<Customer> customerList = new ArrayList<>();
    List<Account> accountList = new ArrayList<>();
    Long lastCustomerId = 0L;
    Long lastAccountId = 0L;
    public Customer createCustomer(String firstName, String lastName){
        Long myNewId = lastCustomerId++;
        Customer cu = new Customer(myNewId, firstName, lastName);
        customerList.add(cu);
        return cu;
    }
    public Account createAccount(Customer cust, boolean isSavings, String currency){

        Long myNewId = lastAccountId++;//first  assigning then plus plus;
        Account acc = isSavings ? new SavingsAccount(myNewId, cust, currency) : new DebitAccount(myNewId, cust, currency); //if true ? true : else
        accountList.add(acc);
        return acc;

    }
    public void transfer(Long accIdFrom, Long accIdTo, Double amount) throws BankExpection{
        Account from = FindAccByID(accIdFrom);
        Account to = FindAccByID(accIdTo);
        try {
            if(from!=null && to!=null){
                if(from.getCurrency()==to.getCurrency()) {
                    if(from.getBalance().compareTo(new BigDecimal(amount))==1) {
                        from.charge(amount);
                        to.deposit(amount);
                    } else {
                        throw new NotEoughMoneyExpection("not enough money on 'from' acc");
                    }
                } else {
                    throw new WrongCurrency("currencies don't match");
                }
            } else {
                throw new NullPointerException();
            }

        } catch (BankExpection | NullPointerException e) {
            System.out.println("something went wrong " + e);

        }

    }

    private Account FindAccByID(Long accID){

        for(Account account : accountList){
           if(account.getAccountId()==accID){
               return account;
           }
        }
        return null;

    }


    @Override
    public String toString() {
        return "Bank{" +
                "customerList=" + customerList +
                ", accountList=" + accountList +
                ", lastCustomerId=" + lastCustomerId +
                ", lastAccountId=" + lastAccountId +
                '}';
    }
}
