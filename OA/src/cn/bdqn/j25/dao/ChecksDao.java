package cn.bdqn.j25.dao;

import java.math.BigDecimal;
import java.util.List;

import cn.bdqn.j25.pojo.Checks;
import cn.bdqn.j25.pojo.Employee;
import cn.bdqn.j25.pojo.Proorder;
import cn.bdqn.j25.pojo.Types;

public interface ChecksDao {

	public List<Checks> findAll();
	
	public Checks mergeChecks(Checks checks);
	
	public List<Checks> findChecksById(int checkId);
	
	public List<Checks> findChecksByEmployeeId(int employeeId);
	
	public List<Checks> findChecksByProorderId(int proorderId);

	
}
