package bank.expections;


/**
 * Created by Mateusz on 10.05.2017.
 */
public class NegativeAmountExpection extends BankExpection{
    public NegativeAmountExpection(String s) {
        super(s);
    }
}
