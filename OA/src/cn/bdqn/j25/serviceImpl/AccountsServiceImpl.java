package cn.bdqn.j25.serviceImpl;

import java.util.List;

import cn.bdqn.j25.dao.AccountsDao;
import cn.bdqn.j25.pojo.Accounts;
import cn.bdqn.j25.service.AccountsService;

public class AccountsServiceImpl implements AccountsService {

	private AccountsDao accountsDao;
	
	public AccountsDao getAccountsDao() {
		return accountsDao;
	}

	public void setAccountsDao(AccountsDao accountsDao) {
		this.accountsDao = accountsDao;
	}

	@Override
	public Accounts findByid(int id) {
		// TODO Auto-generated method stub
		return accountsDao.findByid(id);
	}

	@Override
	public List<Accounts> findAll() {
		// TODO Auto-generated method stub
		return accountsDao.findAll();
	}

	@Override
	public List<Accounts> findByPeopleName(String name) {
		// TODO Auto-generated method stub
		return accountsDao.findByPeopleName(name);
	}

	@Override
	public List<Accounts> findByOutOrIn(String out) {
		// TODO Auto-generated method stub
		return accountsDao.findByOutOrIn(out);
	}

	@Override
	public List<Accounts> findByTime(String[] time, int first, int end) {
		// TODO Auto-generated method stub
		return accountsDao.findByTime(time, first, end);
	}

	@Override
	public List<Accounts> findByPageTime(int first, int end) {
		// TODO Auto-generated method stub
		return accountsDao.findByPageTime(first, end);
	}

	@Override
	public Accounts addOrUpdateAccounts(Accounts accounts) {
		// TODO Auto-generated method stub
		return accountsDao.addOrUpdateAccounts(accounts);
	}

	@Override
	public void delAccounts(Accounts accounts) {
		// TODO Auto-generated method stub
		accountsDao.delAccounts(accounts);
	}

}
