package bank;

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
