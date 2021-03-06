package com.engin.fakau.local;

import java.math.BigDecimal;
import java.util.List;

import javax.ejb.Local;

import com.engin.fakau.domaine.Account;

@Local
public interface IAccountLocal {
	public Account createAccount(Account account);
	public Account UpdateAccount(Account account);
	public Account getAccountBySecurityCode(Long securityCode);
	public Account deposit(Long securityCode, BigDecimal amount);
	public Account withdrawal(Long securityCode, BigDecimal amount);
	public void transfer(Long fromSecurityCode, BigDecimal fromAmount, Long toSecurityCode);
	public List<Account> getAll();
}
