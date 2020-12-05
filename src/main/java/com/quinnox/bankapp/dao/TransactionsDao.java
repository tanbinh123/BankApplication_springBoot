package com.quinnox.bankapp.dao;

import java.util.List;

import com.quinnox.bankapp.entites.Transactions;

public interface TransactionsDao {
	
	public boolean addTransaction(Transactions transaction);
	
	public List<Transactions> customerCredit(int customerid);
	
	public List<Transactions> getTransactionByName(String beneficiaryname);
	
	public List<Transactions> getAllTransactions();

}
