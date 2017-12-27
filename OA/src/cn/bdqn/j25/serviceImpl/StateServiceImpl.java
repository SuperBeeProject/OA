package cn.bdqn.j25.serviceImpl;

import java.util.List;

import cn.bdqn.j25.dao.StateDao;
import cn.bdqn.j25.pojo.State;
import cn.bdqn.j25.service.StateService;

public class StateServiceImpl implements StateService {

	private StateDao stateDao;
	
	public StateDao getStateDao() {
		return stateDao;
	}

	public void setStateDao(StateDao stateDao) {
		this.stateDao = stateDao;
	}

	@Override
	public State findByid(int id) {
		// TODO Auto-generated method stub
		return stateDao.findByid(id);
	}

	@Override
	public List<State> findByName(String name) {
		// TODO Auto-generated method stub
		return stateDao.findByName(name);
	}

	@Override
	public State addOrUpdateState(State state) {
		// TODO Auto-generated method stub
		return stateDao.addOrUpdateState(state);
	}

	@Override
	public void delState(State state) {
		// TODO Auto-generated method stub
		stateDao.delState(state);
	}

}
