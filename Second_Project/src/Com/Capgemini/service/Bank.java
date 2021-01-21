package Com.Capgemini.service;

import Com.Capgemini.exception.InsufficientBalanceException;
import Com.Capgemini.exception.InsufficientOpeningAmountException;
import Com.Capgemini.exception.InvalidAccountNumberException;

public interface Bank {
	public String createAccount(int accountNumber,int amount) throws InsufficientOpeningAmountException;
	public int withdrawAmount(int accountNumber,int amount) throws InvalidAccountNumberException, InsufficientBalanceException;
	public int[] fundTransfer(int senderAccountNumber,int recieverAcoountNumber,int transferAmount) throws InvalidAccountNumberException, InsufficientBalanceException;
	public int depositeAmount(int accountNumber,int amount)throws InvalidAccountNumberException;

}
