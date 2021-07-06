package application;

import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Account acc = new Account();
		acc.setHolder("Kim");
		acc.setNumber(0001);
		acc.deposit(1000.00);
		System.out.println("Number: "+acc.getNumber());
		System.out.println("Holder: "+ acc.getHolder());
		System.out.println("Balance: "+ acc.getBalance());
		
		Account acc1 = new Account(0002, "Ana", 500.00);
		System.out.println("Number: "+acc1.getNumber());
		System.out.println("Holder: "+ acc1.getHolder());
		System.out.println("Balance: "+ acc1.getBalance());
		
		Account bacc = new BusinessAccount(0003, "Maria", 100.00, 50.00);
		System.out.println("Number: "+bacc.getNumber());
		System.out.println("Holder: "+ bacc.getHolder());
		System.out.println("Balance: "+ bacc.getBalance());
		
	}
}
