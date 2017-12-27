package cn.bdqn.j25.service;

import java.util.List;

import cn.bdqn.j25.pojo.Checks;

public interface ChecksService {

	public List<Checks> findAll();
	
	public Checks mergeChecks(Checks checks);
	
	public List<Checks> findChecksById(int checkId);
	
	public List<Checks> findChecksByEmployeeId(int employeeId);
	
	public List<Checks> findChecksByProorderId(int proorderId);
}
